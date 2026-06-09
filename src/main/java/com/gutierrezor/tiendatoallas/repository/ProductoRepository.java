package com.gutierrezor.tiendatoallas.repository;

import com.gutierrezor.tiendatoallas.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
