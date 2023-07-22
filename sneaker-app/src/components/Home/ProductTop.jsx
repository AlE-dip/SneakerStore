import SingleProduct from "../common/SingleProduct";

let productView = (productTop) => {
  let list = productTop.map(data =>
    <SingleProduct></SingleProduct>
  )
  console.log(list)
  return list
}

let fun1 = async () => {
  for(let i = 0; i < 100; i++){
    console.log("fun1: ", i)
  }
}

let fun2 = async () => {
  for(let i = 0; i < 100; i++){
    console.log("fun2: ", i)
  }
}

function ProductTop({list: productTop}) {
  fun1()
  fun2()
  return (
    <div className="col-sm-9">
      <div className="row">
        <div className="product-content">
          <div className="tab-content">
            <div
              role="tabpanel"
              className="tab-pane active fade in home2"
              id="gird"
            >
              {productView(productTop)}

            </div>
            <div role="tabpanel" className="tab-pane fade home2" id="list">
              <div className="product-catagory">
                <div className="single-list-product">
                  <div className="col-sm-4">
                    <div className="list-product-img">
                      <a href="single-product.html">
                        <img src="img/product/1.png" alt />
                      </a>
                    </div>
                  </div>
                  <div className="col-sm-8">
                    <div className="list-product-info">
                      <a
                        href="single-product.html"
                        className="list-product-name"
                      >
                        {" "}
                        Cras neque metus
                      </a>
                      <div className="price-rating">
                        <span className="old-price">$700.00</span>
                        <span>$800.00</span>
                        <div className="ratings">
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star-half-o" />
                          <a href="#" className="review">
                            1 Review(s)
                          </a>
                          <a href="#" className="add-review">
                            Add Your Review
                          </a>
                        </div>
                      </div>
                      <div className="list-product-details">
                        <p>
                          Nunc facilisis sagittis ullamcorper. Proin lectus
                          ipsum, gravida et mattis vulputate, tristique ut
                          lectus. Sed et lorem nunc. Vestibulum ante ipsum
                          primis in faucibus orci luctus et ultrices posuere
                          cubilia Curae; Aenean eleifend laoreet congue. Vivamus
                          adipiscing nisl ut dolor dignissim semper. Nul
                          <a href="single-product.html">Learn More</a>{" "}
                        </p>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="single-list-product">
                  <div className="col-sm-4">
                    <div className="list-product-img">
                      <a href="single-product.html">
                        <img src="img/product/6.png" alt />
                      </a>
                    </div>
                  </div>
                  <div className="col-sm-8">
                    <div className="list-product-info">
                      <a
                        href="single-product.html"
                        className="list-product-name"
                      >
                        {" "}
                        Cras neque metus
                      </a>
                      <div className="price-rating">
                        <span className="old-price">$700.00</span>
                        <span>$800.00</span>
                        <div className="ratings">
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star-half-o" />
                          <a href="#" className="review">
                            1 Review(s)
                          </a>
                          <a href="#" className="add-review">
                            Add Your Review
                          </a>
                        </div>
                      </div>
                      <div className="list-product-details">
                        <p>
                          Nunc facilisis sagittis ullamcorper. Proin lectus
                          ipsum, gravida et mattis vulputate, tristique ut
                          lectus. Sed et lorem nunc. Vestibulum ante ipsum
                          primis in faucibus orci luctus et ultrices posuere
                          cubilia Curae; Aenean eleifend laoreet congue. Vivamus
                          adipiscing nisl ut dolor dignissim semper. Nul
                          <a href="single-product.html">Learn More</a>{" "}
                        </p>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="single-list-product">
                  <div className="col-sm-4">
                    <div className="list-product-img">
                      <a href="single-product.html">
                        <img src="img/product/3.png" alt />
                      </a>
                    </div>
                  </div>
                  <div className="col-sm-8">
                    <div className="list-product-info">
                      <a
                        href="single-product.html"
                        className="list-product-name"
                      >
                        {" "}
                        Cras neque metus
                      </a>
                      <div className="price-rating">
                        <span className="old-price">$700.00</span>
                        <span>$800.00</span>
                        <div className="ratings">
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star-half-o" />
                          <a href="#" className="review">
                            1 Review(s)
                          </a>
                          <a href="#" className="add-review">
                            Add Your Review
                          </a>
                        </div>
                      </div>
                      <div className="list-product-details">
                        <p>
                          Nunc facilisis sagittis ullamcorper. Proin lectus
                          ipsum, gravida et mattis vulputate, tristique ut
                          lectus. Sed et lorem nunc. Vestibulum ante ipsum
                          primis in faucibus orci luctus et ultrices posuere
                          cubilia Curae; Aenean eleifend laoreet congue. Vivamus
                          adipiscing nisl ut dolor dignissim semper. Nul
                          <a href="single-product.html">Learn More</a>{" "}
                        </p>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="single-list-product">
                  <div className="col-sm-4">
                    <div className="list-product-img">
                      <a href="single-product.html">
                        <img src="img/product/4.png" alt />
                      </a>
                    </div>
                  </div>
                  <div className="col-sm-8">
                    <div className="list-product-info">
                      <a
                        href="single-product.html"
                        className="list-product-name"
                      >
                        {" "}
                        Cras neque metus
                      </a>
                      <div className="price-rating">
                        <span className="old-price">$700.00</span>
                        <span>$800.00</span>
                        <div className="ratings">
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star-half-o" />
                          <a href="#" className="review">
                            1 Review(s)
                          </a>
                          <a href="#" className="add-review">
                            Add Your Review
                          </a>
                        </div>
                      </div>
                      <div className="list-product-details">
                        <p>
                          Nunc facilisis sagittis ullamcorper. Proin lectus
                          ipsum, gravida et mattis vulputate, tristique ut
                          lectus. Sed et lorem nunc. Vestibulum ante ipsum
                          primis in faucibus orci luctus et ultrices posuere
                          cubilia Curae; Aenean eleifend laoreet congue. Vivamus
                          adipiscing nisl ut dolor dignissim semper. Nul
                          <a href="single-product.html">Learn More</a>{" "}
                        </p>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="single-list-product">
                  <div className="col-sm-4">
                    <div className="list-product-img">
                      <a href="single-product.html">
                        <img src="img/product/5.png" alt />
                      </a>
                    </div>
                  </div>
                  <div className="col-sm-8">
                    <div className="list-product-info">
                      <a
                        href="single-product.html"
                        className="list-product-name"
                      >
                        {" "}
                        Cras neque metus
                      </a>
                      <div className="price-rating">
                        <span className="old-price">$700.00</span>
                        <span>$800.00</span>
                        <div className="ratings">
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star" />
                          <i className="fa fa-star-half-o" />
                          <a href="#" className="review">
                            1 Review(s)
                          </a>
                          <a href="#" className="add-review">
                            Add Your Review
                          </a>
                        </div>
                      </div>
                      <div className="list-product-details">
                        <p>
                          Nunc facilisis sagittis ullamcorper. Proin lectus
                          ipsum, gravida et mattis vulputate, tristique ut
                          lectus. Sed et lorem nunc. Vestibulum ante ipsum
                          primis in faucibus orci luctus et ultrices posuere
                          cubilia Curae; Aenean eleifend laoreet congue. Vivamus
                          adipiscing nisl ut dolor dignissim semper. Nul
                          <a href="single-product.html">Learn More</a>{" "}
                        </p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div className="col-md-12">
          <div className="toolbar-bottom">
            <ul>
              <li>
                <span>Pages:</span>
              </li>
              <li className="current">
                <a href="#">1</a>
              </li>
              <li>
                <a href="#">2</a>
              </li>
              <li>
                <a href="#">3</a>
              </li>
              <li>
                <a href="#">
                  {" "}
                  <img src="img/product/pager_arrow_right.gif" alt />{" "}
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
}

export default ProductTop
