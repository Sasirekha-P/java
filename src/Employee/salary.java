package Employee;
public class salary {
    int emp_id,Bpay;
    String emp_name,dept,designation;
    salary(int id,String name,String dept,String desig,int bpay)
    {
        this.emp_id=id;
        this.emp_name=name;
        this.dept=dept;
        this.designation=desig;
        this.Bpay=bpay;
    }
    double da=0;
    double hra=0;
    double ma=0;
    double insu=0;
    double pf=0;
    double allownaces=0;
    double gpay=0;
    double netpay=0;
    public void calculate_Salary()
    {
        if(Bpay<=25000)
        {
            da=Bpay*0.12;
            hra=Bpay*0.20;
            ma=Bpay*0.05;
            insu=Bpay*0.02;
            pf=Bpay*0.07;
        }
        else{
            da=Bpay*0.15;
            hra=Bpay*0.25;
            ma=Bpay*0.07;
            insu=Bpay*0.05;
            pf=Bpay*0.10;
        }
        allownaces=da+hra+ma;
        gpay=Bpay+allownaces;
        netpay=gpay-(pf+insu);
        System.out.println("Employee id: "+ emp_id);
        System.out.println("Employee Name: "+ emp_name);
        System.out.println("Employee Department: "+ dept);
        System.out.println("Employee Designation: "+ designation);
        System.out.println("Employee Basic Pay: "+ Bpay);
        System.out.println("Employee DA: "+ da);
        System.out.println("Employee HRA: "+ hra);
        System.out.println("Employee MA: "+ ma);
        System.out.println("Employee Insurance: "+ insu);
        System.out.println("Employee PF: "+ pf);
        System.out.println("Employee Total Allowances: "+ allownaces);
        System.out.println("Employee Gross Pay: "+ gpay);
        System.out.println("Employee Net Pay: "+ netpay);
    }
}