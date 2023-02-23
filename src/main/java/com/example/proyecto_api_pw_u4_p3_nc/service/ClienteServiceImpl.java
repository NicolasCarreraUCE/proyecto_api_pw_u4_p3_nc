package com.example.proyecto_api_pw_u4_p3_nc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto_api_pw_u4_p3_nc.model.Cliente;
import com.example.proyecto_api_pw_u4_p3_nc.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;
    
    @Override
    public Cliente buscarClientePorCedula(String cedula) {
        // TODO Auto-generated method stub
        return this.clienteRepository.buscarClientePorCedula(cedula);
    }

    @Override
    public void insertarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        this.clienteRepository.insertarCliente(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        this.clienteRepository.actualizarCliente(cliente);
    }

    @Override
    public List<Cliente> buscarClientes() {
        // TODO Auto-generated method stub
        return this.clienteRepository.buscarClientes();
    }

    @Override
    public void borrarPorElId(Integer id) {
        // TODO Auto-generated method stub
        this.clienteRepository.borrarPorElId(id);
    }

    @Override
    public void borrarPorCedual(String cedula) {
        // TODO Auto-generated method stub
        this.clienteRepository.borrarPorCedual(cedula);
    }
    
}
