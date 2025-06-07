<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Home - Products</title>
<style>
body {
	margin: 0;
	padding: 0;
	background-color: #121212;
	color: #ffffff;
	font-family: Arial, sans-serif;
}

header {
	background-color: #1e1e1e;
	padding: 20px;
	text-align: center;
	font-size: 24px;
	font-weight: bold;
	border-bottom: 1px solid #333;
}

.container {
	padding: 30px;
	max-width: 1200px;
	margin: auto;
}

.product-grid {
	display: grid;
	grid-template-columns: repeat(auto-fill, minmax(220px, 1fr));
	gap: 20px;
}

.product-card {
	background-color: #1e1e1e;
	border-radius: 10px;
	overflow: hidden;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
	transition: transform 0.2s;
}

.product-card:hover {
	transform: scale(1.03);
}

.product-card img {
	width: 100%;
	height: 180px;
	object-fit: cover;
}

.product-info {
	padding: 15px;
}

.product-info h3 {
	margin: 0 0 10px;
	font-size: 18px;
}

.product-info p {
	margin: 0;
	color: #ccc;
}

.price {
	margin-top: 10px;
	color: #1e90ff;
	font-weight: bold;
}
</style>
</head>
<body>

	<header>Product Store</header>

	<div class="container">
		<h2>Featured Products</h2>
		<div class="product-grid">
			<div class="product-card">
				<img src="https://via.placeholder.com/300x180.png?text=Product+1"
					alt="Product 1">
				<div class="product-info">
					<h3>Product One</h3>
					<p>Short description of product one.</p>
					<div class="price">$29.99</div>
				</div>
			</div>

			<div class="product-card">
				<img src="https://via.placeholder.com/300x180.png?text=Product+2"
					alt="Product 2">
				<div class="product-info">
					<h3>Product Two</h3>
					<p>Short description of product two.</p>
					<div class="price">$19.99</div>
				</div>
			</div>

			<div class="product-card">
				<img src="https://via.placeholder.com/300x180.png?text=Product+3"
					alt="Product 3">
				<div class="product-info">
					<h3>Product Three</h3>
					<p>Short description of product three.</p>
					<div class="price">$39.99</div>
				</div>
			</div>

			<div class="product-card">
				<img src="https://via.placeholder.com/300x180.png?text=Product+4"
					alt="Product 4">
				<div class="product-info">
					<h3>Product Four</h3>
					<p>Short description of product four.</p>
					<div class="price">$24.99</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
