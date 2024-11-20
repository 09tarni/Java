class Calculator {
public:
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
};

int main() {
    Calculator calc;
  
    cout << calc.add(5, 10) << endl;         // Outputs 15
    cout << calc.add(5.5, 2.5) << endl;      // Outputs 8.0
    cout << calc.add(1, 2, 3) << endl;       // Outputs 6
    return 0;
}
