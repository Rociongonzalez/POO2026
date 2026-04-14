public class clase4ej1 {

    static class Estudiante {
        String nombre;
        int asistencia;
        boolean trabajosEntregados;
        int notaFinal;

        // Constructor en Java
        public Estudiante(String nombre, int asistencia, boolean trabajosEntregados, int notaFinal) {
            this.nombre = nombre;
            this.asistencia = asistencia;
            this.trabajosEntregados = trabajosEntregados;
            this.notaFinal = notaFinal;
        }

        public String evaluarPromocion() {
            if (this.asistencia >= 80 && this.trabajosEntregados && this.notaFinal >= 6) {
                return this.nombre + " promociona la materia 🎉";
            }

            String mensaje = this.nombre + " NO promociona. Motivos:\n";

            if (this.asistencia < 80) {
                mensaje += "- Asistencia insuficiente\n";
            }
            if (!this.trabajosEntregados) {
                mensaje += "- No entregó todos los trabajos\n";
            }
            if (this.notaFinal < 6) {
                mensaje += "- Nota final menor a 6\n";
            }

            return mensaje;
        }
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ana", 85, true, 7);
        System.out.println(est1.evaluarPromocion());

        Estudiante est2 = new Estudiante("Juan", 70, false, 5);
        System.out.println(est2.evaluarPromocion());
    }
}

