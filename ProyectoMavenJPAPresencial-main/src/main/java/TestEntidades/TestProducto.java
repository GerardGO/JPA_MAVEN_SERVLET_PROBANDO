package TestEntidades;

import java.util.Date;
import java.util.List;
import DaoImp.TblProductoImp;
import model.TblCliente;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		TblProducto tblprod=new TblProducto();
		TblProductoImp tblimp=new TblProductoImp();
		
		//REGISTRANDO PRODUCTO --------------------------------------------
		/*tblprod.setNomprod("chicle");
		tblprod.setPrecio(3.5);
		tblprod.setCantidad(4);
		tblprod.setTotal(tblprod.getPrecio()*tblprod.getCantidad());
		tblprod.setCodbarras("7778899");
		tblprod.setNrolote("lote4589");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblprod.setFechaven(fechasql);
		//invocamos el metodo registrar
		tblimp.RegistrarProducto(tblprod);
		//emitimos mensaje por consola
		System.out.println("Dato registrado en BD");*/
		
		//ACTUALIZANDO PRODUCTO --------------------------------------------
		/*tblprod.setIdproducto(1);
		tblprod.setNomprod("Detergente");
		tblprod.setPrecio(4.5);
		tblprod.setCantidad(5);
		tblimp.ActualizarProducto(tblprod);
		System.out.println("Dato actualizado en BD");*/
		
		//ELIMINANDO PRODUCTO --------------------------------------------
		/*tblprod.setIdproducto(3);
		
		tblimp.EliminarProducto(tblprod);
		
		System.out.println("Dato eliminado");*/
		
		
		/*	idproducto		nomprod		precio		cantidad	total	codbarras	nrolote		fechaven*/
		//LISTAR PRODUCTO --------------------------------------------
		/*List<TblProducto> listado = tblimp.ListarProducto();
		for(TblProducto lis:listado){
			System.out.println("IdProducto \t"+lis.getIdproducto()+"\n"+
								"Nombre \t \t"+lis.getNomprod()+"\n"+
								"Precio \t \t"+lis.getPrecio()+"\n"+
								"Cantidad \t"+lis.getCantidad()+"\n"+
								"Total \t \t"+lis.getTotal()+"\n"+
								"CodBarras \t"+lis.getCodbarras()+"\n"+
								"NroLote \t"+lis.getNrolote()+"\n"+
								"Fecha Ven \t"+lis.getFechaven()+"\n \n");
		}*/
		
		//BUSCAR PRODUCTO --------------------------------------------
		/*tblprod.setIdproducto(1);
		
		TblProducto prod = tblimp.BuscarProducto(tblprod);
		
		System.out.println("IdProducto \t"+prod.getIdproducto()+"\n"+
				"Nombre \t \t"+prod.getNomprod()+"\n"+
				"Precio \t \t"+prod.getPrecio()+"\n"+
				"Cantidad \t"+prod.getCantidad()+"\n"+
				"Total \t \t"+prod.getTotal()+"\n"+
				"CodBarras \t"+prod.getCodbarras()+"\n"+
				"NroLote \t"+prod.getNrolote()+"\n"+
				"Fecha Ven \t"+prod.getFechaven()+"\n \n");*/
		
	}//fin de metodo prinpal..

}//fin de la clase...
