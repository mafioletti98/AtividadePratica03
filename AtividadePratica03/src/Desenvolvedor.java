public class Desenvolvedor extends Funcionario {

    private String tecnologiaDominante;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String tecnologiaDominante) {
        this.tecnologiaDominante = tecnologiaDominante;
    }

    public String getTecnologiaDominante() {
        return tecnologiaDominante;
    }

    public void setTecnologiaDominante(String tecnologiaDominante) {
        this.tecnologiaDominante = tecnologiaDominante;
    }

    @Override
    public String toString() {

        return "Desenvolvedor: " + tecnologiaDominante;
    }

}