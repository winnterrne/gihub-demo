#include<iostream>
#include<math.h>
#include<algorithm>
#include<sstream>
#include<bits/stdc++.h>
using namespace std;
/*
ENCAPSULATION

class Student {
    private:
    string masv;
    string hoten;
    string ngaysinh;
    string lop;
    double gpa;
    public:
    Student(){

    }
    Student(string masv, string hoten, string ngaysinh, string lop, double gpa){
        this -> masv = masv;
        this -> hoten = hoten;
        this -> ngaysinh = ngaysinh;
        this -> lop = lop;
        this -> gpa = gpa;
    }
    void printfInfor(){
        cout << " " << masv << endl;
        cout << " " << hoten << endl;
        cout << " " << ngaysinh << endl;
        cout << " " << lop << endl;
        printf("%.2f\n",gpa); 
    }
    void chuanTen(){
        stringstream ss(hoten);
        string res;
        string word;
        while(ss >> word){
            res += toupper(word[0]);
            for(int i = 1; i< word.size(); i++){
                res += tolower(word[i]);
            }
            res += " ";
        }
        res.pop_back();
        hoten = res;
    }
    static void SortSV(Student a[],int n){
        for(int i = 0; i < n - 1; i++){
            int max = i;
            for(int j = i +1; j < n; j++){
                if(a[j].getGpa() > a[max].getGpa()){
                    max = j;
                }else if(a[j].getGpa() == a[max].getGpa() && a[j].getMa() < a[max].getMa()){
                    max = j;
                }
            }
            swap(a[i], a[max]);
        }
    }
    double getGpa(){
        return gpa;
    }
    string getMa(){
        return masv;
    }
    string getngaysinh(){
        stringstream ss(ngaysinh);
        string ngay;
        string thang;
        string nam;
        getline(ss,ngay,'/');
        getline(ss,thang,'/');
        getline(ss,nam,'/');
        return nam + " " + thang + " " + ngay;
        
    }
    bool getktngaysinh(string gia, string tre){
        return gia < tre;
    }
};
int main(){
    Student a[100];
    int n;
    cin>>n;
    cin.ignore();
    for(int i =0;i < n;i++){
    string masv;
    string hoten;
    string ngaysinh;
    string lop;
    double gpa;
    getline(cin,masv);
    getline(cin,hoten);
    getline(cin,ngaysinh);
    getline(cin,lop);
    cin >> gpa;
    cin.ignore();
    a[i] = Student (masv, hoten, ngaysinh, lop, gpa );
    a[i].chuanTen();
}
    Student::SortSV(a,n);
    for(int i = 0;i < n; i++){
        a[i].printfInfor();
    }
    return 0;
}
*/

// INHERITANCE
/*
class Person {
private:
	string name;
	int dob;
public:
	Person(string name, int dob) {
		this->name = name;
		this->dob = dob;
	}
	void setName(string name){
        this -> name = name;
    }
    void setDob(int dob){
        this -> dob = dob;
    }
    string getName(){
        return name;
    }
    int getDob(){
        return dob;
    }
};

class Student : public Person {
	public:
    double gpa;
    Student(string name, int dob, double gpa) : Person(name, dob){
        this -> gpa = gpa;
    }
    void setGpa(double gpa){
        this -> gpa = gpa;
    }
    double  getGpa(){
        return gpa;
    }
};

int main() {
	Student s("Hai", 1999, 8.8);
	cout << "Name: " << s.getName() << endl;
	cout << "Date of birth: " << s.getDob() << endl;
	cout << "GPA: " << s.getGpa() << endl;
	return 0;
}
*/
/*
class Person {
    private:
      string name;
      string gender;
    public:
      Person(string name, string gender){
        this -> name = name;
        this -> gender = gender;
      }
      void setName(string name){
        this -> name = name;
      }
      void setGender(string gender){
        this -> gender = gender;
      }
      string getName(){
        return name;
      }
      string getGender(){
        return gender;
      }
      void display(){
        cout << "Name: " << name << endl;
        cout << "Gender: " << gender << endl;
      }
};

class Student : public Person{
    public:
    int salary;
    Student(string name, string gender, int salary) : Person (name, gender){
        this -> salary = salary;
    }
    void setSalary(int salary){
        this -> salary = salary;
    }
    int getSalary(){
        return salary;
    }
    void display(){
        Person :: display();
        cout << "Salary: " << salary << endl;
    }
};
int main(){
    Student s("huu","gay",1000);
    s.display();
    return 0;
}
*/
// POLYMORPHISM
/*
class Animal {
    public:
    virtual void sound(){
        cout << "Animal sound " << endl;
    }
};
class Dog : public Animal {
    public:
    void sound(){
        cout << "Dog sound " << endl;
    }
};
class Cat : public Animal {
    public:
    void sound(){
        cout << "Cat sound " << endl;
    }
};

int main(){
    Animal * animal[3];
    animal[0] = new Animal();
    animal[1] = new Dog();
    animal[2] = new Cat(); 
    for(int i = 0; i < 3; i++){
        animal[i] -> sound();
    }
    return 0;
}
*/
