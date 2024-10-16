package cibertec.edu.pe.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.model.Usuario;
import cibertec.edu.pe.repository.IUsuarioRepository;
import cibertec.edu.pe.util.UsuarioReportGenerator;
import net.sf.jasperreports.engine.JRException;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepository repositorio;

	@Override
	public List<Usuario> listarusuarios() {
		return repositorio.findAll();
		// TODO Auto-generated method stub
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return repositorio.save(usuario);
	}

	@Override
	public Optional<Usuario> buscarUsuario(int codigo) {
		// TODO Auto-generated method stub
		return repositorio.findById(codigo);
	}

	@Override
	public void eliminarusuario(int codigo) {
		// TODO Auto-generated method stub
		repositorio.deleteById(codigo);
	}

	@Override
	public byte[] exportPdf() throws JRException, FileNotFoundException {
		// TODO Auto-generated method stub
		return UsuarioReportGenerator.exportToPdf(repositorio.findAll());
	}

}
