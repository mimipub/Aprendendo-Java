package herança_e_polimorfismo.ex_fixacao2;

public class Employ extends TaxPayers{
    private Integer QtdeFuncionarios;

    public Employ() {
        super();
    }

    public Employ(String name, double anualIncome, Integer qtdeFuncionarios) {
        super(name, anualIncome);
        QtdeFuncionarios = qtdeFuncionarios;
    }

    public Integer getQtdeFuncionarios() {
        return QtdeFuncionarios;
    }

    public void setQtdeFuncionarios(Integer qtdeFuncionarios) {
        QtdeFuncionarios = qtdeFuncionarios;
    }

    @Override
    public double taxPayers() {
        if(getQtdeFuncionarios() > 10){
           return getAnualIncome() * 0.14;
        }else{
           return getAnualIncome() * 0.16;
        }
    }
}
