package com.intecap.proyectocolegio;
import com.intecap.proyectocolegio.domain.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ProyectocolegioApplication implements CommandLineRunner{

	private final CategoriaRepository categoriaRepository;
	private final ComentarioRepository comentarioRepository;
	private final ComentarioCursoRepository comentarioCursoRepository;
	private final CursoRepository cursoRepository;
	private final EstudianteRepository estudianteRepository;
	private final InscripcionRepository inscripcionRepository;
	private final InstructorRepository instructorRepository;
	private final LogRepository logRepository;
	private final NivelRepository nivelRepository;

	public ProyectocolegioApplication(
			CategoriaRepository categoriaRepository,
			ComentarioRepository comentarioRepository,
			ComentarioCursoRepository comentarioCursoRepository,
			CursoRepository cursoRepository,
			EstudianteRepository estudianteRepository,
			InscripcionRepository inscripcionRepository,
			InstructorRepository instructorRepository,
			LogRepository logRepository,
			NivelRepository nivelRepository) {

		this.categoriaRepository = categoriaRepository;
		this.comentarioRepository = comentarioRepository;
		this.comentarioCursoRepository = comentarioCursoRepository;
		this.cursoRepository = cursoRepository;
		this.estudianteRepository = estudianteRepository;
		this.inscripcionRepository = inscripcionRepository;
		this.instructorRepository = instructorRepository;
		this.logRepository = logRepository;
		this.nivelRepository = nivelRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectocolegioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
