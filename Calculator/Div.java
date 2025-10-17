class Div extends Operation{
    @Override
    public double getResult(double a, double b) throws IllegalArgumentException {
        if( b == 0 ){
            throw new IllegalArgumentException("不可除以零");
        }
        else{
            return a / b;
        }

    }
}
