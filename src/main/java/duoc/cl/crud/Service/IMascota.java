/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duoc.cl.crud.Service;

import duoc.cl.crud.DTO.MascotaDTO;
import java.util.List;

/**
 *
 * @author Zhnz
 */
public interface IMascota {
    public void guardar(MascotaDTO m);
    public List<MascotaDTO> listar();
    public void eliminar();
}
