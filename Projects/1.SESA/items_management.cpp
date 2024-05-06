#include <iostream>
#include <vector>
#include <string>

// Define a structure for Product
struct Product {
    int id;
    std::string name;
    double price;
    int quantity;
};

// Function to initialize products with sample data
std::vector<Product> initializeProducts() {
    return {
        {1, "Decoration   ", 20.0, 50},
        {2, "Flowers      ", 30.0, 40},
        {3, "Machine      ", 50.0, 30}
    };
}

// Function to display available products
void displayProducts(const std::vector<Product>& products) {
    std::cout << "Available Products:\n";
    std::cout << "ID\tName\t\tPrice\tQuantity\n";
    for (const auto& product : products) {
        std::cout << product.id << "\t" << product.name << "\t$" << product.price << "\t" << product.quantity << "\n";
    }
}

// Function to find a product by ID
Product* findProductByID(std::vector<Product>& products, int id) {
    for (auto& product : products) {
        if (product.id == id) {
            return &product;
        }
    }
    return nullptr;
}

// Function to handle buying process
void buyProduct(std::vector<Product>& products) {
    displayProducts(products);

    int id, quantity;
    std::cout << "Enter the ID of the product you want to buy: ";
    std::cin >> id;

    Product* product = findProductByID(products, id);
    if (product == nullptr) {
        std::cout << "Product not found.\n";
        return;
    }

    std::cout << "Enter the quantity you want to buy: ";
    std::cin >> quantity;

    if (quantity <= 0) {
        std::cout << "Invalid quantity. Please enter a positive number.\n";
        return;
    }

    if (product->quantity < quantity) {
        std::cout << "Not enough quantity available.\n";
        return;
    }

    product->quantity -= quantity;
    std::cout << quantity << " " << product->name << "(s) purchased successfully.\n";
}

int main() {
    std::vector<Product> products = initializeProducts();
    
    while (true) {
        std::cout << "\nWelcome to SESA store\n";
        std::cout << "1. View Products\n";
        std::cout << "2. Buy Product\n";
        std::cout << "3. Exit\n";

        int choice;
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
            case 1:
                displayProducts(products);
                break;
            case 2:
                buyProduct(products);
                break;
            case 3:
                std::cout << "Thank you for using SESA store. Goodbye!\n";
                return 0;
            default:
                std::cout << "Invalid choice. Please try again.\n";
        }
    }

    return 0;
}
