// Function to display products
function displayProducts() {
    fetch('get_products.php')
    .then(response => response.json())
    .then(data => {
        var table = document.getElementById("productTable");
        table.innerHTML = `
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
        `;
        data.forEach(product => {
            var row = table.insertRow();
            row.innerHTML = `
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>$${product.price}</td>
                <td>${product.quantity}</td>
                <td><button class="btn" onclick="buyProduct(${product.id})">Buy</button></td>
            `;
        });
    });
}

// Function to handle adding a new product
function addProduct(event) {
    event.preventDefault();
    var productName = document.getElementById("productName").value;
    var productPrice = parseFloat(document.getElementById("productPrice").value);
    var productQuantity = parseInt(document.getElementById("productQuantity").value);
    if (!productName || isNaN(productPrice) || isNaN(productQuantity) || productPrice <= 0 || productQuantity <= 0) {
        alert("Please enter valid product information.");
        return;
    }
    var data = { name: productName, price: productPrice, quantity: productQuantity };
    fetch('add_product.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(() => {
        displayProducts();
        document.getElementById("addProductForm").reset();
    });
}

// Function to handle buying process
function buyProduct(productId) {
    var quantity = prompt("Enter the quantity you want to buy:");
    quantity = parseInt(quantity);
    if (!quantity || quantity <= 0) {
        alert("Invalid quantity. Please enter a positive number.");
        return;
    }
    var data = { id: productId, quantity: quantity };
    fetch('buy_product.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            alert(`${data.quantity} ${data.name}(s) purchased successfully.`);
            displayProducts();
        } else {
            alert(data.message);
        }
    });
}

// Display initial products
displayProducts();

// Add event listener for form submission
document.getElementById("addProductForm").addEventListener("submit", addProduct);
