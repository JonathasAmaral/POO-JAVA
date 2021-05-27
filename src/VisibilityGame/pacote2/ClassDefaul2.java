package VisibilityGame.pacote2;

import VisibilityGame.pacote1.ClassPublic1;

class ClassDefaul2 {
    
    public int variavelPublica;
    protected int variavelProtected;
    int variavelDefault;
    private int variavelPrivate;

    public static void main(String[] args){
        
        // A class pode ser acessada, pois faz parte do mesmo pacote;
        ClassDefaul2 teste = new ClassDefaul2();
        // As variaveis podem ser acessadas
        teste.variavelPublica = 0;
        teste.variavelProtected = 0;
        teste.variavelDefault = 0;
        teste.setVariavelPrivate(0);

        //-----------------------------------

        // A class e acessada pois esta no mesmo pacote;
        ClassPublic2 teste2 = new ClassPublic2();
        //nao e possivel acessar a variavel private;
        teste2.variavelPublica = 0;
        teste2.variavelProtected = 0;
        teste2.variavelDefault = 0;
        // teste2.variavelPrivate = 0;

        //------------------------------------

        //A class nao pode ser acessada pois ela e Defaul;
        // ClassDefaul1 teste3 = new ClassDefaul1();
        // Como a class nao e encontrada, as variaveis tambem nao sao;
        // teste3.variavelPublica = 0;
        // teste3.variavelProtected = 0;
        // teste3.variavelDefault = 0;
        // teste3.variavelPrivate = 0;

        //-------------------------------------

        // A class so pode ser acessada quando importamos o pacote1;
        ClassPublic1 teste4 = new ClassPublic1();
        // So a class public pode ser acessada;
        teste4.variavelPublica = 0;
        // Essas variaveis nao podem ser acessadas;
        // pais o modificador utilizado nao permite;
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
