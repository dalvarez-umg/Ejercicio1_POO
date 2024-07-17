import java.time.LocalDate;

class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean esDevuelto;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.esDevuelto = false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isEsDevuelto() {
        return esDevuelto;
    }

    public void setEsDevuelto(boolean esDevuelto) {
        this.esDevuelto = esDevuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "usuario=" + usuario +
                ", libro=" + libro +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", esDevuelto=" + esDevuelto +
                '}';
    }
}