import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("CURSO PYTHON");
        curso.setDescricao("descricao do curso");
        curso.cargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria python");
        mentoria.setDescricao("descricao");
        mentoria.setData(LocalDate.now());

    }
}
