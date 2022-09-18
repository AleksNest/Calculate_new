public class CalcRelationExpression implements MathArithmeticsRelation {
    private double a;
    private double b;
    private String mathOperation;



    public CalcRelationExpression(Parser parser) {
        this.a = parser.getFirst();
        this.b = parser.getSecond();
        this.mathOperation = parser.getOperation();
    }



    public double solveRelation() throws IllegalAccessException {
        switch (mathOperation) {
            case "+":
                return sumRelation();
            case "-":
                return subRelation();
            case "/":
                return divRelation();
            case "*":
                return mulRelation();
            default:
                throw new IllegalAccessException("IllegalAccessException");
        }
    }

    @Override
    public double sumRelation() {return a+b;}
    @Override
    public double subRelation() {return a-b;}
    @Override
    public double divRelation() {return a/b;}
    @Override
    public double mulRelation() {return a*b;}
}

