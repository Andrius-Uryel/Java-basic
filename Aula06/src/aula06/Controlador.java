package aula06;

public interface Controlador { //interface

    public abstract void ligar(); // metodo para ligar controlador

    public abstract void desligar(); // metodo para desligar controlador

    public abstract void abrirMenu(); // metodo para abrir menu do controlador

    public abstract void fecharMenu(); // metodo para fechar menu do controlador

    public abstract void maisVolume(); // metodo para aumentar volume do controlador

    public abstract void menosVolume(); // metodo para diminuir volume do controlador

    public abstract void ligarMudo(); // metodo para colocar no mudo o controlador

    public abstract void desligarMudo(); // metodo para desligar mudo do controlador

    public abstract void play(); // metodo para executar o play no controlador

    public abstract void pause(); // metodo para pausar no controlador
}
