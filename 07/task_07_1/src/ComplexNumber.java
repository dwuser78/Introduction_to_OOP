public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double mod()
    {
        return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    public ComplexNumber conjugate()
    {
        return new ComplexNumber(this.real,-this.imaginary);
    }

    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2)
    {
        return new ComplexNumber(num1.real + num2.real,
                        num1.imaginary + num2.imaginary);
    }

    public static ComplexNumber divide(ComplexNumber num1, ComplexNumber num2)
    {
        ComplexNumber output = multiply(num1,num2.conjugate());
        double div = Math.pow(num2.mod(),2);
        return new ComplexNumber(output.real/div,output.imaginary/div);
    }

    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2)
    {
        double _real = num1.real*num2.real - num1.imaginary*num2.imaginary;
        double _imaginary = num1.real*num2.imaginary + num1.imaginary*num2.real;
        return new ComplexNumber(_real,_imaginary);
    }

    @Override
    public String toString()
    {
        String re = this.real+"";
        String unr = "";
        if(this.imaginary < 0)
            unr = this.imaginary+"i";
        else
            unr = "+"+this.imaginary+"i";
        return re+unr;
    }
}
