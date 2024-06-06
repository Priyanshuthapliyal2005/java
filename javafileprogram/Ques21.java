class Ques21{
    public static void main(String args[]){
        int sum=0,temp, invalid=0;
        String[] str= new String[args.length];
        for(int i=0; i<args.length; i++){
            try{
                temp=Integer.parseInt(args[i]);
                sum+=temp;
            }
            catch(NumberFormatException e){
                str[invalid]=args[i];
                invalid++;
            }
        }
        System.out.println(sum);
        System.out.println("Invalid integers = "+invalid);
        for(int i=0; i<invalid; i++){
            System.out.println(str[i]);
        }
        System.out.println();
        System.out.println("Calculating sum and printing invalid integer from command line argument");
        System.out.println("");
        System.out.println("Implemented by- Priyanshu Thapliyal \t RollNumber- 46 \t CS4(A2)");
        System.out.println("");
    }
}
