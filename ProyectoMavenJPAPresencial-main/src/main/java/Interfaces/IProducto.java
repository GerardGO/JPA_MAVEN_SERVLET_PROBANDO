package Interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
	//declaramos sus metodos...
	void RegistrarProducto(TblProducto producto);
	void ActualizarProducto(TblProducto producto);
	void EliminarProducto(TblProducto producto);
	List<TblProducto> ListarProducto();
	TblProducto BuscarProducto(TblProducto producto);
	

}//fin de interface .....
