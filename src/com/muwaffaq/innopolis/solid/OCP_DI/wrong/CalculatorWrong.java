package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//

interface Operation {
    double perform(double left, double right);
}

class Add implements Operation {
    public double perform(double left, double right) {
        return left + right;
    }
}

class Substract implements Operation {
    public double perform(double left, double right) {
        return left - right;
    }
}

class Divide implements Operation {
    public double perform(double left, double right) {
        return left / right;
    }
}

class Multiply implements Operation {
    public double perform(double left, double right) {
        return left * right;
    }
}

 class CalculatorWrong {
    private double left;
    private double right;

    /// ❌ ❌ ❌ ❌
    /// this function violates the OP principle
    /// because it depend on concrete classes enum
    public double calculate(Operation operation) {
        double result;
        result = operation.perform(left, right);
        return result;
    }

    public static void main(String[] args) {
        CalculatorWrong calculator = new CalculatorWrong();
        calculator.calculate(new Add());
        calculator.calculate(new Substract());

    }

}



