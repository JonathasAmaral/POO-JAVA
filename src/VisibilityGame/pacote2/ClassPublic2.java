package VisibilityGame.pacote2;

import VisibilityGame.pacote1.ClassPublic1;

public class ClassPublic2 {
    
    public int variavelPublica;
    protected int variavelProtected;
    int variavelDefault;
    private int variavelPrivate;

    public static void main(String[] args){

        ClassPublic2 teste = new ClassPublic2();
        //E possivel acessar todas as variaveis;
        teste.variavelPublica = 0;
        teste.variavelProtected = 0;
        teste.variavelDefault = 0;
        teste.setVariavelPrivate(0);

        //-----------------------------------------

        // A class pode ser acessada, pois faz parte do mesmo pacote;
        ClassDefaul2 teste2 = new ClassDefaul2();
        // As variaveis tambem podem ser acessadas, menos a private;
        teste2.variavelPublica = 0;
        teste2.variavelProtected = 0;
        teste2.variavelDefault = 0;
        // teste2.variavelPrivate = 0;

        //------------------------------------------
        
        // A class so pode ser acessada quando importamos o pacote1;
        ClassPublic1 teste3 = new ClassPublic1();
        // So a class public pode ser acessada;
        teste3.variavelPublica = 0;
        // Essas variaveis nao podem ser acessadas;
        // pais o modificador utilizado nao permite;
        // teste3.variavelProtected = 0;
        // teste3.variavelDefault = 0;
        // teste3.variavelPrivate = 0;

        //--------------------------------------------

        //A class nao pode ser acessada pois ela e Defaul;
        // ClassDefaul1 teste4 = new ClassDefaul1();
        // Como a class nao e encontrada, as variaveis tambem nao sao;
        // teste4.variavelPublica = 0;
        // teste4.variavelProtected = 0;
        // teste4.variavelDefault = 0;
        // teste4.variavelPrivate = 0;
    }

    public int getVariavelPrivate() {
        return variavelPrivate;
    }

    public void setVariavelPrivate(int variavelPrivate) {
        this.variavelPrivate = variavelPrivate;
    }
}
