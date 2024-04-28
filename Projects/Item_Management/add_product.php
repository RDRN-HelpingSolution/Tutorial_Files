<?php
// Get data from request body
$data = json_decode(file_get_contents('php://input'), true);

// Validate data
if (!isset($data['name']) || !isset($data['price']) || !isset($data['quantity'])) {
    echo json_encode(array("success" => false, "message" => "Invalid data."));
    exit;
}

// Connect to the database
$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "mall_db";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Insert product into the database
$name = $data['name'];
$price = $data['price'];
$quantity = $data['quantity'];

$sql = "INSERT INTO products (name, price, quantity) VALUES ('$name', $price, $quantity)";
if ($conn->query($sql) === TRUE) {
    echo json_encode(array("success" => true));
} else {
    echo json_encode(array("success" => false, "message" => "Error: " . $sql . "<br>" . $conn->error));
}

// Close connection
$conn->close();
?>
