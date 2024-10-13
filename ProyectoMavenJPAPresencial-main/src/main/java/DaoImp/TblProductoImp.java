package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.*;
import model.TblProducto;

public class TblProductoImp implements IProducto {
	//nos conectamos con la U.P.	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMarNoche");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public void RegistrarProducto(TblProducto producto) {
	     try{
		//iniciamos la transaccion..
		em.getTransaction().begin();
		//invocamos al metodo registrar...
		em.persist(producto);
		//confirmamos
		em.getTransaction().commit();
	     }catch(RuntimeException ex){
	    	
	    	ex.getMessage(); 
	     }finally{
		//cerramos
		em.close();
	     }
	
	}//fin del metodo reg...

	@Override
	public void ActualizarProducto(TblProducto producto) {
		try {
			em.getTransaction().begin();
			em.merge(producto);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}//fin del metodo act...

	@Override
	public void EliminarProducto(TblProducto producto) {
		try {
			 em.getTransaction().begin();
			 TblProducto eliminarPro = em.find(TblProducto.class,producto.getIdproducto());
			 if(eliminarPro !=null){
				 em.remove(eliminarPro);
				 
				 em.getTransaction().commit();
			 }
			 
		} catch (RuntimeException e) {
			e.getMessage();
			
		}finally {
			em.close();
		}
		
	}//fin del metodo elim...

	@Override
	public List<TblProducto> ListarProducto() {
		List<TblProducto> listado = null;
		
		try {
			//Iniciar la Transacción
			em.getTransaction().begin();
			//Aplicamos consulta JPA (JAVA PERSISTENCE QUERY LANGUAGE )
			listado=em.createQuery("select c from TblProducto c",TblProducto.class).getResultList();
		
			//Confirmamos 
			em.getTransaction().commit();
			
		
		}catch(RuntimeException ex){
			ex.getMessage();
		}
		finally {
			em.close();
		}
		
		return listado;
	}//fin del metodo lis...

	@Override
	public TblProducto BuscarProducto(TblProducto producto) {
		TblProducto  tblPro =null;
		try{
		//Iniciar Transacción
		em.getTransaction().begin();
		//Recuperamos el ID del Cliente
		tblPro=em.find(TblProducto.class,producto.getIdproducto());
		/*if(tblPro !=null){
			System.out.print("     \t  \n ==== Cliente encontrado ==== \n\n");
		}else{
			System.out.print("\n Cliente NO encontrado :( ");
		}*/
		//Confirmamos Transacción
		em.getTransaction().commit();
		
		//retornamos el cliente
		}catch(RuntimeException e){
			e.getMessage();
		}finally {
			//cerramos 
			em.close();
		}
		return tblPro;
	} //fin del metodo busc...

}//fin de la clase...
