package es.iessanadres.prg.proyectoInst;

public class Main {

	public static void main(String[] args) {
		Profesor pepe = new Profesor("Pepe", "Martinez", "Perez", 41);
		Profesor maria = new Profesor("María", "Martinez", "Perez", 41);
		
		Profesor[] profesores = new Profesor[2];
		profesores[0] = pepe;
		profesores[1] = maria;
		
		Departamento depLen = new Departamento("Departamento de Lengua", profesores);
		Departamento depMat = new Departamento("Departamento de Matemáticas", profesores);
		
		Departamento[] departamentos = new Departamento[2];
		departamentos[0] = depLen;
		departamentos[1] = depMat;
		
		//Crear un instituto
		Instituto instituto1 = new Instituto("IES San Andrés", departamentos);
		
		Alumno alumno1 = new Alumno("Mario","perez","martin",20);
		Alumno alumno2 = new Alumno("Maria","perez","martin",20);
		Alumno alumno3 = new Alumno("Elena","perez","martin",20);
		Alumno[] alumnos = new Alumno[3];
		alumnos[0] = alumno1;
		alumnos[1] = alumno2;
		alumnos[2] = alumno3;
		
		Asignatura programacion = new Asignatura("Programacion", alumnos, pepe);
		Asignatura basesDeDatos = new Asignatura("Bases de Datos", alumnos, maria);
		Asignatura[] asignaturas = new Asignatura[2];
		asignaturas[0] = programacion;
		asignaturas[1] = basesDeDatos;
		
		asignarNota(alumnos, asignaturas);
	}
	
	//Funcion para asignar notas a alumnos
	
	public static void asignarNota(Alumno[] arrAlum, Asignatura[] arrAsig) {
		System.out.println("Elige un alumno para asignar una nota: ");
		
		for (int i = 0; i < arrAlum.length; i++) {
			System.out.println(i + "- " +arrAlum[i].getNombre());
		}
		
		int alumno = Teclado.readInteger();
		
		System.out.println("Elige una asignatura para asignar una nota: ");
		
		for (int i = 0; i < arrAsig.length; i++) {
			System.out.println(i + "- " +arrAsig[i].getNombre());
		}
		int asignatura = Teclado.readInteger();
		
		System.out.println("Introduce el valor de la nota: ");
		float nota = Teclado.readFloat();
		
		Nota nota1 = new Nota(nota, arrAlum[alumno], arrAsig[asignatura]);
		
		System.out.println("Alumno: " + nota1.getAlumno().getNombre());
		System.out.println("Asignatura: " + nota1.getAsignatura().getNombre());
		System.out.println("Nota: " + nota1.getPuntuacion());
	}

}
