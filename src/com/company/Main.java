package com.company;

public class Main {

    static final String S = "World";

    public static void cookingMetod(int i, char l) {System.out.println("woter: " + i + ", liters:" + 'l');}
    public static void cookingMetod(char l, int i) {System.out.println("liters:" + 'l'+ ", woter" + i);}

        Main Temp(){
            System.out.println("Good");
            return this;
        }
        void result() {
            Main s = new Main();
            s.Temp();
            this.Temp();
        }

    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test(S);

        Main text =new Main();
        text.result();

        Dog d = new Dog();
        d.TestConst();
        d.TestChar();
        d.TestByte();
        d.TestShort();
        d.TestInt();
        d.TestLong();
        d.TestFloat();
        d.TestDouble();

        cookingMetod(2, 'l');
        cookingMetod('l', 2);

        WitoutConstructor w = new WitoutConstructor();
        w.text();
    }

    static class Test {
        Test() {
            System.out.println("Hello");
        }

        Test(String S) {
            System.out.println("Hello" + S);
        }
    }

    static class Dog {
        void bark1(char x) {
            System.out.println("bark(char)");
        }
        void bark1(byte x) {
            System.out.println("bark(byte)");
        }
        void bark1(short x) {
            System.out.println("bark(short)");
        }
        void bark1(int x) {
            System.out.println("bark(int)");
        }
        void bark1(long x) {
            System.out.println("bark(long)");
        }
        void bark1(float x) {
            System.out.println("bark(float)");
        }
        void bark1(double x) {
            System.out.println("bark(double)");
        }
        void bark2(byte x) {
            System.out.println("bark(byte)");
        }
        void bark2(short x) {
            System.out.println("bark(short)");
        }
        void bark2(int x) {
            System.out.println("bark(int)");
        }
        void bark2(long x) {
            System.out.println("bark(long)");
        }
        void bark2(float x) {
            System.out.println("bark(float)");
        }
        void bark2(double x) {
            System.out.println("bark(double)");
        }
        void bark3(short x) {
            System.out.println("bark(short)");
        }
        void bark3(int x) {
            System.out.println("bark(int)");
        }
        void bark3(long x) {
            System.out.println("bark(long)");
        }
        void bark3(float x) {
            System.out.println("bark(float)");
        }
        void bark3(double x) {
            System.out.println("bark(double)");
        }
        void bark4(int x) {
            System.out.println("bark(int)");
        }
        void bark4(long x) {
            System.out.println("bark(long)");
        }
        void bark4(float x) {
            System.out.println("bark(float)");
        }
        void bark4(double x) {
            System.out.println("bark(double)");
        }
        void bark5(long x) {
            System.out.println("bark(long)");
        }
        void bark5(float x) {
            System.out.println("bark(float)");
        }
        void bark5(double x) {
            System.out.println("bark(double)");
        }
        void bark6(float x) {
            System.out.println("bark(float)");
        }
        void bark6(double x) {
            System.out.println("bark(double)");
        }
        void bark7(double x) {
            System.out.println("bark(double)");
        }

        void TestConst() {
            System.out.println("5 times: ");
            bark1(5);
            bark2(5);
            bark3(5);
            bark4(5);
            bark5(5);
            bark6(5);
            bark7(5);
            System.out.println();
        }

        void TestChar() {
            char x = 'g';
            System.out.println("Gav: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }

        void TestByte() {
            byte x = 0;
            System.out.println("howl: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }

        void TestShort() {
            short x = 0;
            System.out.println("whining: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }

        void TestInt() {
            int x = 0;
            System.out.println("woof: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }

        void TestLong() {
            long x = 0;
            System.out.println("growl: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }

        void TestFloat() {
            float x = 0;
            System.out.println("moan: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }

        void TestDouble() {
            double x = 0;
            System.out.println("noise: ");
            bark1(x);
            bark2(x);
            bark3(x);
            bark4(x);
            bark5(x);
            bark6(x);
            bark7(x);
            System.out.println();
        }
    }
    static class WitoutConstructor{
        public static void text(){
            System.out.println("without constructor");
        }
    }
}