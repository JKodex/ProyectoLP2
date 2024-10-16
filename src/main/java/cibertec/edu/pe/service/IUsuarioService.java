package cibertec.edu.pe.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import cibertec.edu.pe.model.Usuario;
import net.sf.jasperreports.engine.JRException;

public interface IUsuarioService {
	
	public List<Usuario> listarusuarios();
	public Usuario guardarUsuario(Usuario usuario);
	public Optional <Usuario> buscarUsuario(int codigo);
	public void eliminarusuario(int codigo);
	byte[] exportPdf() throws JRException, FileNotFoundException;

}
