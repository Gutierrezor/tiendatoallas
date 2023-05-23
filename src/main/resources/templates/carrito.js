window.addEventListener('DOMContentLoaded', () => {

  const carritoLink = document.querySelector('a[href="pedido.html"]');

  carritoLink.addEventListener('click', (event) => {
    event.preventDefault();

    const productosSeleccionados = obtenerProductosSeleccionados();

    mostrarCarrito(productosSeleccionados);

    window.location.href = 'carrito.html';
  });
});

function obtenerProductosSeleccionados() {
  const carrito = JSON.parse(sessionStorage.getItem('carrito')) || [];
  return carrito;
}

function mostrarCarrito(productosSeleccionados) {
  const carritoContainer = document.getElementById('carrito');

  // Limpiar el contenido existente en el contenedor del carrito
  carritoContainer.innerHTML = '';

  // Crear y agregar elementos al contenedor del carrito
  productosSeleccionados.forEach((producto) => {
    const productoDiv = document.createElement('div');
    productoDiv.textContent = `${producto.nombre} - ${producto.tamaño} - ${producto.precio}`;
    carritoContainer.appendChild(productoDiv);
  });
}
