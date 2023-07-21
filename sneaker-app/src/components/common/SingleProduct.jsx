function SingleProduct() {
  return (
    <div className="col-lg-4 col-sm-6">
      <div className="single-product">
        <div className="level-pro-new">
          <span>new</span>
        </div>
        <div className="product-img">
          <a href="single-product.html">
            <img src="img/product/25.png" alt className="primary-img" />
            <img src="img/product/26.png" alt className="secondary-img" />
          </a>
        </div>
        <div className="actions">
          <button type="submit" className="cart-btn" title="Add to cart">
            add to cart
          </button>
          <ul className="add-to-link">
            <li>
              <a
                className="modal-view"
                data-target="#productModal"
                data-toggle="modal"
                href="#"
              >
                {" "}
                <i className="fa fa-search" />
              </a>
            </li>
            <li>
              <a href="#">
                {" "}
                <i className="fa fa-heart-o" />
              </a>
            </li>
            <li>
              <a href="#">
                {" "}
                <i className="fa fa-refresh" />
              </a>
            </li>
          </ul>
        </div>
        <div className="product-price">
          <div className="product-name">
            <a href="single-product.html" title="Fusce aliquam">
              Fusce aliquam
            </a>
          </div>
          <div className="price-rating">
            <span>$170.00</span>
            <div className="ratings">
              <i className="fa fa-star" />
              <i className="fa fa-star" />
              <i className="fa fa-star" />
              <i className="fa fa-star" />
              <i className="fa fa-star-half-o" />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
export default SingleProduct;
