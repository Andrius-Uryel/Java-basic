package aula011;
public class Tecnico extends Aluno{
    private int registroProfissional;
    public void praticar(){
        System.out.println(this.nome + " Esta praticando.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
