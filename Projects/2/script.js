document.addEventListener('DOMContentLoaded', function () {
    const productList = document.getElementById('productList');
    const addProductForm = document.getElementById('addProductForm');
  
    addProductForm.addEventListener('submit', function (event) {
      event.preventDefault();
      
      const productName = document.getElementById('productName').value;
      const category = document.getElementById('category').value;
      const productPrice = parseFloat(document.getElementById('productPrice').value);
      const productQuantity = parseInt(document.getElementById('productQuantity').value);
  
      if (productName && category && !isNaN(productPrice) && !isNaN(productQuantity)) {
        addProductToList(productName, category, productPrice, productQuantity);
        addProductForm.reset();
        saveProductsToLocalStorage();
      } else {
        alert('Please fill in all fields with valid values.');
      }
    });
  
    productList.addEventListener('click', function (event) {
      const target = event.target;
      if (target.classList.contains('delete')) {
        const productElement = target.closest('.product');
        deleteProduct(productElement);
        saveProductsToLocalStorage();
      } else if (target.classList.contains('edit')) {
        const productElement = target.closest('.product');
        editProduct(productElement);
      }
    });
  
    function addProductToList(name, category, price, quantity) {
      const product = {
        name: name,
        category: category,
        price: price,
        quantity: quantity
      };
      
      const productElement = document.createElement('div');
      productElement.classList.add('product');
      productElement.innerHTML = `
        <strong>Name:</strong> ${name}<br>
        <strong>Category:</strong> ${category}<br>
        <strong>Price:</strong> ${price.toFixed(2)}<br>
        <strong>Quantity:</strong> ${quantity}<br>
        <button class="delete">Delete</button>
        <button class="edit">Edit</button>
      `;
      productList.appendChild(productElement);
    }
  
    function deleteProduct(productElement) {
      productElement.remove();
    }
  
    function editProduct(productElement) {
      const name = productElement.querySelector('strong').textContent.split(': ')[1];
      const category = productElement.querySelector('strong:nth-of-type(2)').textContent.split(': ')[1];
      const price = parseFloat(productElement.querySelector('strong:nth-of-type(3)').textContent.split(': ')[1]);
      const quantity = parseInt(productElement.querySelector('strong:nth-of-type(4)').textContent.split(': ')[1]);
  
      document.getElementById('productName').value = name;
      document.getElementById('category').value = category;
      document.getElementById('productPrice').value = price;
      document.getElementById('productQuantity').value = quantity;
  
      productElement.remove();
    }
  
    function saveProductsToLocalStorage() {
      const products = [];
      const productElements = productList.getElementsByClassName('product');
  
      for (let productElement of productElements) {
        const name = productElement.querySelector('strong').textContent.split(': ')[1];
        const category = productElement.querySelector('strong:nth-of-type(2)').textContent.split(': ')[1];
        const price = parseFloat(productElement.querySelector('strong:nth-of-type(3)').textContent.split(': ')[1]);
        const quantity = parseInt(productElement.querySelector('strong:nth-of-type(4)').textContent.split(': ')[1]);
  
        products.push({ name, category, price, quantity });
      }
  
      localStorage.setItem('products', JSON.stringify(products));
    }
  
    function loadProductsFromLocalStorage() {
      const products = JSON.parse(localStorage.getItem('products')) || [];
      for (let product of products) {
        addProductToList(product.name, product.category, product.price, product.quantity);
      }
    }
  
    loadProductsFromLocalStorage();
  });
  