package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comedia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime"),
    AVENTURA("Adventure", "Aventura");

    private String categoriaOmdb;
    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaProtugues){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaProtugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if  (categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada.");
    }

    public static Categoria fromProtugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if  (categoria.categoriaPortugues.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada.");
    }

}
