public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado emp1 = new Empregado();
        Empregado emp2 = new Empregado();
        Empregado emp3 = new Empregado();

        emp1.setTipo(1);
        emp2.setTipo(2);
        emp3.setTipo(3);
        //configurando algum valor 
        emp1.setSalario(5000);
        emp2.setSalario(1700);
        emp2.setComissao(0.2); // 20% de comissão sobre o sálario 
        emp3.setSalario(1500);
        emp3.setBonus(400);
        //mostrar valores 
        System.out.println(emp1.CalculaSalario());
        System.out.println(emp2.CalculaSalario());
        System.out.println(emp3.CalculaSalario());

        //git add *
        //git commit -m ""
        //git push
        

    
    }

 


}
