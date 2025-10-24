let myIndex = 0;
carousel();

function carousel() {
  const slides = document.getElementsByClassName("mySlides");
  if(slides.length == 0) return;
  for (let i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > slides.length) myIndex = 1;
  slides[myIndex - 1].style.display = "block";
  setTimeout(carousel, 3500);
}


// ---- Đăng nhập ----
const loginBtn = document.getElementById("loginBtn");
if (loginBtn) {
  loginBtn.addEventListener("click", () => {
    const email = document.getElementById("email").value.trim().toLowerCase();
    const password = document.getElementById("password").value.trim();
    const error = document.getElementById("error");
    const users = JSON.parse(localStorage.getItem("bookstore_users") || "[]");

    const found = users.find(
      (u) => u.email === email && u.password === password
    );
    if (found) {
      localStorage.setItem("bookstore_user", JSON.stringify(found));
      window.location.href = "index.html";
    } else {
      error.textContent = "Email hoặc mật khẩu không đúng!";
      error.style.display = "block";
    }
  });
}

// ---- Đăng xuất ----
const logoutBtn = document.getElementById("logoutBtn");
if (logoutBtn) {
  logoutBtn.addEventListener("click", () => {
    localStorage.removeItem("bookstore_user");
    window.location.reload();
  });
}

// ---- Đăng ký ----
const registerBtn = document.getElementById("registerBtn");
if (registerBtn) {
  registerBtn.addEventListener("click", () => {
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim().toLowerCase();
    const password = document.getElementById("password").value.trim();
    const error = document.getElementById("error");

    if (!name || !email || !password) {
      error.textContent = "Vui lòng điền đầy đủ thông tin.";
      error.style.display = "block";
      return;
    }
    if (password.length < 6) {
      error.textContent = "Mật khẩu phải có ít nhất 6 ký tự.";
      error.style.display = "block";
      return;
    }

    const users = JSON.parse(localStorage.getItem("bookstore_users") || "[]");
    if (users.find((u) => u.email === email)) {
      error.textContent = "Email này đã được sử dụng.";
      error.style.display = "block";
      return;
    }

    const newUser = { name, email, password };
    users.push(newUser);
    localStorage.setItem("bookstore_users", JSON.stringify(users));
    localStorage.setItem("bookstore_user", JSON.stringify(newUser));

    window.location.href = "index.html";
  });
}

// updateUI();

// ====== GIỎ HÀNG ======
const cartItems = document.getElementById("cartItems");
const cartTotal = document.getElementById("cartTotal");

// Lấy & lưu giỏ hàng
function getCart() {
  try {
    return JSON.parse(localStorage.getItem("bookstore_cart")) || [];
  } catch {
    return [];
  }
}

function saveCart(cart) {
  localStorage.setItem("bookstore_cart", JSON.stringify(cart));
}

function renderCart() {
  if (!cartItems) return;
  const cart = getCart();
  let total = 0;
  cartItems.innerHTML = "";

  if (cart.length === 0) {
    cartItems.innerHTML = `
      <tr><td colspan="4" style="text-align:center; padding:20px;">Giỏ hàng trống 🛒</td></tr>
    `;
    if (cartTotal) cartTotal.textContent = "0đ";
    return;
  }

  cart.forEach((item, index) => {
    const subTotal = item.price * item.quantity;
    total += subTotal;

    const row = document.createElement("tr");
    row.innerHTML = `
      <td class="cart-product">
        <img src="${item.image}" alt="${item.title}">
        <div>
          <strong>${item.title}</strong><br>
          <span class="remove" onclick="removeItem(${index})">Xóa</span>
        </div>
      </td>
      <td class="price">${item.price.toLocaleString()}đ</td>
      <td class="qty">
        <button onclick="changeQty(${index}, -1)">-</button>
        <span>${item.quantity}</span>
        <button onclick="changeQty(${index}, 1)">+</button>
      </td>
      <td class="subtotal">${subTotal.toLocaleString()}đ</td>
    `;
    cartItems.appendChild(row);
  });

  if (cartTotal) cartTotal.textContent = total.toLocaleString() + "đ";
}

function changeQty(index, delta) {
  const cart = getCart();
  if (cart[index].quantity + delta > 0) {
    cart[index].quantity += delta;
    saveCart(cart);
    renderCart();
  }
}

function removeItem(index) {
  const cart = getCart();
  cart.splice(index, 1);
  saveCart(cart);
  renderCart();
}

// Xử lý form đặt hàng
const orderForm = document.getElementById("orderForm");
if (orderForm) {
  orderForm.addEventListener("submit", (e) => {
    e.preventDefault();
    const cart = getCart();

    if (cart.length === 0) {
      alert(
        "Giỏ hàng của bạn đang trống! Vui lòng thêm sản phẩm trước khi đặt hàng 💛"
      );
      return; // Dừng không cho đặt
    }

    alert("Đặt hàng thành công 💚 Cảm ơn bạn đã mua sách tại BookStore!");
    localStorage.removeItem("bookstore_cart");
    renderCart();
  });
}

// Chạy render khi có trang giỏ hàng
renderCart();