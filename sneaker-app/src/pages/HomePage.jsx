import { useSelector } from "react-redux";
import ProductTop from "../components/Home/ProductTop";

function HomePage() {
  const productTops = useSelector(state => state.productTop.list)
  console.log("productTops", productTops)


  return (
    <div>
      &lt;&gt;
      <header>
        <div className="top-link">
          <div className="container">
            <div className="row">
              <div className="col-md-7 col-md-offset-3 col-sm-9 hidden-xs">
                <div className="site-option">
                  <ul>
                    <li className="currency">
                      <a href="#">
                        USD <i className="fa fa-angle-down" />{" "}
                      </a>
                      <ul className="sub-site-option">
                        <li>
                          <a href="#">Eur</a>
                        </li>
                        <li>
                          <a href="#">Usd</a>
                        </li>
                      </ul>
                    </li>
                    <li className="language">
                      <a href="#">
                        English <i className="fa fa-angle-down" />{" "}
                      </a>
                      <ul className="sub-site-option">
                        <li>
                          <a href="#">English</a>
                        </li>
                        <li>
                          <a href="#">English2</a>
                        </li>
                      </ul>
                    </li>
                  </ul>
                </div>
                <div className="call-support">
                  <p>
                    Call support free: <span> (800) 123 456 789</span>
                  </p>
                </div>
              </div>
              <div className="col-md-2 col-sm-3">
                <div className="dashboard">
                  <div className="account-menu">
                    <ul>
                      <li>
                        <a href="#">
                          <i className="fa fa-bars" />
                        </a>
                        <ul>
                          <li>
                            <a href="my-account.html">my account</a>
                          </li>
                          <li>
                            <a href="wishlist.html">my wishlist</a>
                          </li>
                          <li>
                            <a href="cart.html">my cart</a>
                          </li>
                          <li>
                            <a href="checkout.html">Checkout</a>
                          </li>
                          <li>
                            <a href="blog.html">Blog</a>
                          </li>
                          <li>
                            <a href="#">Log in</a>
                          </li>
                        </ul>
                      </li>
                    </ul>
                  </div>
                  <div className="cart-menu">
                    <ul>
                      <li>
                        <a href="#">
                          <img src="img/icon-cart.png" alt /> <span>2</span>
                        </a>
                        <div className="cart-info">
                          <ul>
                            <li>
                              <div className="cart-img">
                                <img src="img/cart/1.png" alt />
                              </div>
                              <div className="cart-details">
                                <a href="#">Fusce aliquam</a>
                                <p>1 x $174.00</p>
                              </div>
                              <div className="btn-edit" />
                              <div className="btn-remove" />
                            </li>
                            <li>
                              <div className="cart-img">
                                <img src="img/cart/2.png" alt />
                              </div>
                              <div className="cart-details">
                                <a href="#">Fusce aliquam</a>
                                <p>1 x $777.00</p>
                              </div>
                              <div className="btn-edit" />
                              <div className="btn-remove" />
                            </li>
                          </ul>
                          <h3>
                            Subtotal: <span> $951.00</span>
                          </h3>
                          <a href="checkout.html" className="checkout">
                            checkout
                          </a>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div className="mainmenu-area product-items">
          <div className="container">
            <div className="row">
              <div className="col-md-3">
                <div className="logo">
                  <a href="index.html">
                    <img src="img/logo.png" alt />
                  </a>
                </div>
              </div>
              <div className="col-md-9">
                <div className="mainmenu">
                  <nav>
                    <ul>
                      <li>
                        <a href="index.html">Home</a>
                        <div className="sub-menu">
                          <span>
                            <a href="index.html">Home version 1</a>
                          </span>
                          <span>
                            <a href="index-2.html">Home version 2</a>
                          </span>
                        </div>
                      </li>
                      <li className="mega-women">
                        <a href="shop.html">Women</a>
                        <div className="mega-menu women">
                          <div className="part-1">
                            <span>
                              <a href="#">Dresses</a>
                              <a href="#">Cocktail</a>
                              <a href="#">Day</a>
                              <a href="#">Evening</a>
                              <a href="#">Sports</a>
                            </span>
                            <span>
                              <a href="#">shoes</a>
                              <a href="#">Sports</a>
                              <a href="#">run</a>
                              <a href="#">sandals</a>
                              <a href="#">Books</a>
                            </span>
                            <span>
                              <a href="#">Handbags</a>
                              <a href="#">Blazers</a>
                              <a href="#">table</a>
                              <a href="#">coats</a>
                              <a href="#">kids</a>
                            </span>
                            <span>
                              <a href="#">Clothing</a>
                              <a href="#">T-shirts</a>
                              <a href="#">coats</a>
                              <a href="#">Jackets</a>
                              <a href="#">jeans</a>
                            </span>
                          </div>
                          <div className="part-2">
                            <a href="#">
                              <img src="img/banner/menu-banner.png" alt />
                            </a>
                          </div>
                        </div>
                      </li>
                      <li className="mega-men">
                        <a href="shop.html">Men</a>
                        <div className="mega-menu men">
                          <span>
                            <a href="#">Bags</a>
                            <a href="#">Bootees Bags</a>
                            <a href="#">Blazers</a>
                          </span>
                          <span>
                            <a href="#">Clothing</a>
                            <a href="#">coats</a>
                            <a href="#">T-shirts</a>
                          </span>
                          <span>
                            <a href="#">Lingerie</a>
                            <a href="#">Bands</a>
                            <a href="#">Furniture</a>
                          </span>
                        </div>
                      </li>
                      <li className="mega-footwear">
                        <a href="shop.html">Footwear</a>
                        <div className="mega-menu footwear">
                          <span>
                            <a href="#">Footwear Man</a>
                            <a href="#">gifts</a>
                          </span>
                          <span>
                            <a href="#">Footwear Womens</a>
                            <a href="#">boots</a>
                          </span>
                        </div>
                      </li>
                      <li className="mega-jewellery">
                        <a href="shop.html">Jewellery</a>
                        <div className="mega-menu jewellery">
                          <span>
                            <a href="#">Rings</a>
                          </span>
                        </div>
                      </li>
                      <li>
                        <a href="shop.html">accessories</a>
                      </li>
                      <li>
                        <a href="#">Pages</a>
                        <div className="sub-menu pages">
                          <span>
                            <a href="about-us.html">About us</a>
                          </span>
                          <span>
                            <a href="blog.html">Blog</a>
                          </span>
                          <span>
                            <a href="blog-details.html">Blog Details</a>
                          </span>
                          <span>
                            <a href="cart.html">Cart</a>
                          </span>
                          <span>
                            <a href="checkout.html">Checkout</a>
                          </span>
                          <span>
                            <a href="contact.html">Contact</a>
                          </span>
                          <span>
                            <a href="my-account.html">My account</a>
                          </span>
                          <span>
                            <a href="shop.html">Shop</a>
                          </span>
                          <span>
                            <a href="shop-list.html">Shop list</a>
                          </span>
                          <span>
                            <a href="single-product.html">Single Shop</a>
                          </span>
                          <span>
                            <a href="login.html">Login page</a>
                          </span>
                          <span>
                            <a href="register.html">Ragister page</a>
                          </span>
                          <span>
                            <a href="wishlist.html">Wishlist</a>
                          </span>
                        </div>
                      </li>
                    </ul>
                  </nav>
                </div>
              </div>
              <div className="col-sm-12">
                <div className="mobile-menu">
                  <nav>
                    <ul>
                      <li>
                        <a href="index.html">Home</a>
                        <ul>
                          <li>
                            <a href="index.html">Home 1</a>
                          </li>
                          <li>
                            <a href="index-2.html">Home 2</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a href="shop.html">Women</a>
                        <ul>
                          <li>
                            <a href="#">Dresses</a>
                            <ul>
                              <li>
                                <a href="#">Coctail</a>
                              </li>
                              <li>
                                <a href="#">day</a>
                              </li>
                              <li>
                                <a href="#">evening</a>
                              </li>
                              <li>
                                <a href="#">sports</a>
                              </li>
                            </ul>
                          </li>
                          <li>
                            <a href="#">shoes</a>
                            <ul>
                              <li>
                                <a href="#">Sports</a>
                              </li>
                              <li>
                                <a href="#">run</a>
                              </li>
                              <li>
                                <a href="#">sandals</a>
                              </li>
                              <li>
                                <a href="#">boots</a>
                              </li>
                            </ul>
                          </li>
                          <li>
                            <a href="#">handbags</a>
                            <ul>
                              <li>
                                <a href="#">Blazers</a>
                              </li>
                              <li>
                                <a href="#">table</a>
                              </li>
                              <li>
                                <a href="#">coats</a>
                              </li>
                              <li>
                                <a href="#">kids</a>
                              </li>
                            </ul>
                          </li>
                          <li>
                            <a href="#">clothing</a>
                            <ul>
                              <li>
                                <a href="#">T-shirts</a>
                              </li>
                              <li>
                                <a href="#">coats</a>
                              </li>
                              <li>
                                <a href="#">Jackets</a>
                              </li>
                              <li>
                                <a href="#">jeans</a>
                              </li>
                            </ul>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a href="shop.html">Men</a>
                        <ul>
                          <li>
                            <a href="#">Bags</a>
                            <ul>
                              <li>
                                <a href="#">Bootees bag</a>
                              </li>
                              <li>
                                <a href="#">Blazers</a>
                              </li>
                            </ul>
                          </li>
                          <li>
                            <a href="#">clothing</a>
                            <ul>
                              <li>
                                <a href="#">coats</a>
                              </li>
                              <li>
                                <a href="#">T-shirts</a>
                              </li>
                            </ul>
                          </li>
                          <li>
                            <a href="#">Lingerie</a>
                            <ul>
                              <li>
                                <a href="#">Bands</a>
                              </li>
                              <li>
                                <a href="#">Furniture</a>
                              </li>
                            </ul>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a href="shop.html">Foorwear</a>
                        <ul>
                          <li>
                            <a href="#">footwear men</a>
                            <ul>
                              <li>
                                <a href="#">gifts</a>
                              </li>
                            </ul>
                          </li>
                          <li>
                            <a href="#">footwear women</a>
                            <ul>
                              <li>
                                <a href="#">boots</a>
                              </li>
                            </ul>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a href="shop.html">Jewellery</a>
                        <ul>
                          <li>
                            <a href="#">Rings</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a href="shop.html">Accessories</a>
                      </li>
                      <li>
                        <a href="#">Pages</a>
                        <ul>
                          <li>
                            <a href="about-us.html">About us</a>
                          </li>
                          <li>
                            <a href="blog.html">Blog</a>
                          </li>
                          <li>
                            <a href="blog-details.html">Blog Details</a>
                          </li>
                          <li>
                            <a href="cart.html">Cart</a>
                          </li>
                          <li>
                            <a href="checkout.html">Checkout</a>
                          </li>
                          <li>
                            <a href="contact.html">Contact</a>
                          </li>
                          <li>
                            <a href="my-account.html">My account</a>
                          </li>
                          <li>
                            <a href="shop.html">Shop</a>
                          </li>
                          <li>
                            <a href="shop-list.html">Shop list</a>
                          </li>
                          <li>
                            <a href="single-product.html">Single Shop</a>
                          </li>
                          <li>
                            <a href="wishlist.html">Wishlist</a>
                          </li>
                          <li>
                            <a href="login.html">login page</a>
                          </li>
                          <li>
                            <a href="register.html">register page</a>
                          </li>
                        </ul>
                      </li>
                    </ul>
                  </nav>
                </div>
              </div>
            </div>
          </div>
        </div>
      </header>
      {/* header area end */}
      {/* slider area start */}
      <div className="slider-area home1">
        <div className="bend niceties preview-2">
          <div id="nivoslider" className="slides">
            <img
              src="img/slider/slider-1.jpg"
              alt
              title="#slider-direction-1"
            />
            <img
              src="img/slider/slider-2.jpg"
              alt
              title="#slider-direction-2"
            />
          </div>
          {/* direction 1 */}
          <div id="slider-direction-1" className="t-cn slider-direction">
            <div className="slider-progress" />
            <div className="slider-content t-lfl s-tb slider-1">
              <div className="title-container s-tb-c title-compress">
                <h1 className="title1">Sale products</h1>
                <h2 className="title2">nike Ari max 2015</h2>
                <h3 className="title3">
                  Lorem Ipsum is simply dummy text of the printing
                </h3>
                <a href="#">
                  <span>read more</span>
                </a>
              </div>
            </div>
          </div>
          {/* direction 2 */}
          <div id="slider-direction-2" className="slider-direction">
            <div className="slider-progress" />
            <div className="slider-content t-lfl s-tb slider-2">
              <div className="title-container s-tb-c">
                <h1 className="title1">Sale products</h1>
                <h2 className="title2">GET UP TO 50% SALE</h2>
                <h3 className="title3">
                  Lorem Ipsum is simply dummy text of the printing
                </h3>
                <a href="#">
                  <span>read more</span>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* slider area end */}
      {/* banner area start */}
      <div className="banner-area">
        <div className="single-banner">
          <div className="part-1">
            <div className="box-1 box">
              <h4>nike ari max 2015</h4>
              <h2>air superiority</h2>
              <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting
                industry.
              </p>
              <a href="#">shopping now</a>
            </div>
            <div className="box-2">
              <a href="#">
                <img src="img/banner/banner-2.jpg" alt />
              </a>
            </div>
          </div>
          <div className="part-2">
            <div className="search-box">
              <form action="#">
                <input type="text" />
                <button type="submit">
                  <i className="fa fa-search" />
                </button>
              </form>
            </div>
            <div className="box-3">
              <a href="#">
                <img src="img/banner/banner-1.jpg" alt />
              </a>
            </div>
            <div className="box-4 box">
              <h4>nike ari max 2015</h4>
              <h2>air superiority</h2>
              <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting
                industry.
              </p>
              <a href="#">shopping now</a>
            </div>
            <div className="box-5">
              <a href="#">
                <img src="img/banner/banner-3.jpg" alt />
              </a>
            </div>
            <div className="box-6">
              <a href="#">
                <img src="img/banner/banner-4.jpg" alt />
              </a>
            </div>
          </div>
        </div>
      </div>
      {/* banner area end */}
      {/* products area start */}
      <div className="products-area">
        <div className="container">
          <div className="products">
            <div className="row">
              <div className="col-md-3">
                <div className="product-menu">
                  <div className="menu-title">
                    <h2>
                      Best seller <strong>Products</strong>
                    </h2>
                  </div>
                  <div className="side-menu">
                    {/* Nav tabs */}
                    <ul className="tab-navigation" role="tablist">
                      <li role="presentation" className="active">
                        <a
                          href="#tab1"
                          aria-controls="tab1"
                          role="tab"
                          data-toggle="tab"
                        >
                          Women
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab2"
                          aria-controls="tab2"
                          role="tab"
                          data-toggle="tab"
                        >
                          men
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab3"
                          aria-controls="tab3"
                          role="tab"
                          data-toggle="tab"
                        >
                          Footwear
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab4"
                          aria-controls="tab4"
                          role="tab"
                          data-toggle="tab"
                        >
                          Jewellery
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab5"
                          aria-controls="tab5"
                          role="tab"
                          data-toggle="tab"
                        >
                          Accessories
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab6"
                          aria-controls="tab6"
                          role="tab"
                          data-toggle="tab"
                        >
                          Dresses
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab7"
                          aria-controls="tab7"
                          role="tab"
                          data-toggle="tab"
                        >
                          shoes
                        </a>
                      </li>
                      <li role="presentation">
                        <a
                          href="#tab8"
                          aria-controls="tab8"
                          role="tab"
                          data-toggle="tab"
                        >
                          Handbags
                        </a>
                      </li>
                      <li>
                        <img src="img/banner/banner-5.jpg" alt />
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
              <ProductTop list={[1, 2, 3,4,5,6,7,5,4,3]}></ProductTop>
            </div>
          </div>
        </div>
      </div>
      {/* products area end */}
      {/* feature products area start */}
      <div className="features-product-area">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <div className="section-heading">
                <h2>FEATURED PRODUCTS</h2>
              </div>
            </div>
          </div>
          <div className="row">
            <div className="feature-product-slider">
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-new">
                    <span>new</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/1.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/2.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/7.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/8.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/3.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/4.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/9.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/10.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/5.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/6.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-new">
                    <span>new</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/3.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/4.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/19.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/20.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/13.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/14.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/15.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/16.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-new">
                    <span>new</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/17.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/18.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* feature products area end */}
      {/* another banner area start */}
      <div className="another-banner-area">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <div className="big-banner">
                <a href="#">
                  <img src="img/banner/banner-10.jpg" alt />
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* another banner area end */}
      {/* new products area start */}
      <div className="new-products-area">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <div className="section-heading">
                <h2>NEW PRODUCTS</h2>
              </div>
            </div>
          </div>
          <div className="row">
            <div className="new-product-slider">
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-new">
                    <span>new</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/25.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/26.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/3.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/4.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/2.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/8.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/1.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/2.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/17.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/18.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-new">
                    <span>new</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/19.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/20.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="level-pro-sale">
                    <span>sale</span>
                  </div>
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/21.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/22.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
              <div className="col-md-12">
                <div className="single-product">
                  <div className="product-img">
                    <a href="single-product.html">
                      <img
                        src="img/product/23.png"
                        alt
                        className="primary-img"
                      />
                      <img
                        src="img/product/24.png"
                        alt
                        className="secondary-img"
                      />
                    </a>
                  </div>
                  <div className="product-name">
                    <a href="single-product.html" title="Fusce aliquam">
                      Fusce aliquam
                    </a>
                  </div>
                  <div className="price-rating">
                    <span className="old-price">$700.00</span>
                    <span>$800.00</span>
                    <div className="ratings">
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star" />
                      <i className="fa fa-star-half-o" />
                    </div>
                  </div>
                  <div className="actions">
                    <button
                      type="submit"
                      className="cart-btn"
                      title="Add to cart"
                    >
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
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* new products area end */}
      {/* testimonial area start */}
      <div className="testimonial-area">
        <div className="container">
          <div className="row">
            <div className="testimonial-slider">
              <div className="single-testimonial">
                <div className="spech">
                  <a href="#">
                    “ Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                    sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                    magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
                    quis nostrud exerci tation ullamcorper suscipit lobortis
                    nisl ut aliquip ex ea commodo consequat ”
                  </a>
                </div>
                <div className="avater">
                  <img src="img/testimonial/1.jpg" alt />
                </div>
                <div className="post-by">
                  <span>Salim Rana</span>
                </div>
              </div>
              <div className="single-testimonial">
                <div className="spech">
                  <a href="#">
                    “ Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                    sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                    magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
                    quis nostrud exerci tation ullamcorper suscipit lobortis
                    nisl ut aliquip ex ea commodo consequat ”
                  </a>
                </div>
                <div className="avater">
                  <img src="img/testimonial/2.jpg" alt />
                </div>
                <div className="post-by">
                  <span>Hridoy Roy</span>
                </div>
              </div>
              <div className="single-testimonial">
                <div className="spech">
                  <a href="#">
                    “ Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                    sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                    magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
                    quis nostrud exerci tation ullamcorper suscipit lobortis
                    nisl ut aliquip ex ea commodo consequat ”
                  </a>
                </div>
                <div className="avater">
                  <img src="img/testimonial/3.jpg" alt />
                </div>
                <div className="post-by">
                  <span>themesplaza</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* testimonial area end */}
      {/* blog area start */}
      <div className="blog-area">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <div className="blog-heading">
                <h2>
                  From <strong> The Blog</strong>
                </h2>
              </div>
            </div>
          </div>
          <div className="row">
            <div className="col-md-12">
              <div className="blog-post">
                <div className="single-blog-post">
                  <div className="blog-img">
                    <a href="blog-details.html">
                      <img src="img/blog/1.jpg" alt />
                    </a>
                  </div>
                  <div className="blog-content">
                    <a href="blog-details.html" className="blog-title">
                      Lorem ipsum dolor sit amet
                    </a>
                    <span>
                      <a href="#">By plaza themes - </a>17 Aug 2015 ( 0 comments
                      )
                    </span>
                    <p>
                      Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                      sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                      magna...
                    </p>
                    <a href="blog-details.html" className="readmore">
                      read more &gt;
                    </a>
                  </div>
                </div>
                <div className="single-blog-post">
                  <div className="blog-img">
                    <a href="blog-details.html">
                      <img src="img/blog/2.jpg" alt />
                    </a>
                  </div>
                  <div className="blog-content">
                    <a href="blog-details.html" className="blog-title">
                      Lorem ipsum dolor sit amet
                    </a>
                    <span>
                      <a href="#">By plaza themes - </a>17 Aug 2015 ( 0 comments
                      )
                    </span>
                    <p>
                      Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                      sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                      magna...
                    </p>
                    <a href="blog-details.html" className="readmore">
                      read more &gt;
                    </a>
                  </div>
                </div>
              </div>
              <div className="single-blog-post">
                <div className="blog-img">
                  <a href="blog-details.html">
                    <img src="img/blog/3.jpg" alt />
                  </a>
                </div>
                <div className="blog-content">
                  <a href="blog-details.html" className="blog-title">
                    Lorem ipsum dolor sit amet
                  </a>
                  <span>
                    <a href="#">By plaza themes - </a>17 Aug 2015 ( 0 comments )
                  </span>
                  <p>
                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                    sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                    magna...
                  </p>
                  <a href="blog-details.html" className="readmore">
                    read more &gt;
                  </a>
                </div>
              </div>
              <div className="single-blog-post">
                <div className="blog-img">
                  <a href="blog-details.html">
                    <img src="img/blog/4.jpg" alt />
                  </a>
                </div>
                <div className="blog-content">
                  <a href="blog-details.html" className="blog-title">
                    Lorem ipsum dolor sit amet
                  </a>
                  <span>
                    <a href="#">By plaza themes - </a>17 Aug 2015 ( 0 comments )
                  </span>
                  <p>
                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                    sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                    magna...
                  </p>
                  <a href="blog-details.html" className="readmore">
                    read more &gt;
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* blog area end */}
      {/* newsleter area start */}
      <div className="newsleter-area">
        <div className="container">
          <div className="row">
            <div className="col-sm-6">
              <div className="newsleter">
                <h3>newsletter</h3>
                <p>
                  Subscribe to the james mailing list to receive updates on new
                  arrivals, special offers and other discount information.
                </p>
                <div className="Subscribe">
                  <form action="#">
                    <input type="text" title="Sign up" />
                    <button type="submit" title="Subscribe">
                      Subscribe
                    </button>
                  </form>
                </div>
              </div>
            </div>
            <div className="col-sm-6">
              <div className="follow">
                <h3>follow</h3>
                <p>
                  Subscribe to the james mailing list to receive updates on new
                  arrivals, special offers and other discount information.
                </p>
                <ul className="follow-link">
                  <li>
                    <a href="#">
                      {" "}
                      <i className="fa fa-facebook" />{" "}
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      {" "}
                      <i className="fa fa-rss" />{" "}
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      {" "}
                      <i className="fa fa-twitter" />{" "}
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      {" "}
                      <i className="fa fa-google-plus" />{" "}
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* newsleter area end */}
      {/* footer top area start */}
      <div className="footer-top-area">
        <div className="container">
          <div className="row">
            <div className="col-md-3 col-sm-4">
              <div className="footer-contact">
                <img src="img/logo-white.png" alt />
                <p>
                  Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed
                  diam nonummy nibh euismod tincidunt.
                </p>
                <ul className="address">
                  <li>
                    <span className="fa fa-fax" />
                    (800) 123 456 789
                  </li>
                  <li>
                    <span className="fa fa-phone" />
                    (800) 123 456 789
                  </li>
                  <li>
                    <span className="fa fa-envelope-o" />
                    admin@bootexperts.com
                  </li>
                </ul>
              </div>
            </div>
            <div className="col-md-3 hidden-sm">
              <div className="footer-tweets">
                <div className="footer-title">
                  <h3>Latest tweets</h3>
                </div>
                <div className="twitter-feed">
                  <div className="twitter-article">
                    <div className="twitter-img">
                      <a href="#">
                        <img src="img/twitter/twitter-1.png" alt />
                      </a>
                    </div>
                    <div className="twitter-text">
                      <p>
                        Raboda Fashion #Magento #Theme comes up with pure white
                        and grey, which great show your products. Check it:
                      </p>
                      <a href="#">https://t.co/iu0OYBwti8</a>
                      <div className="twitter-time">
                        <a href="#">16h</a>
                      </div>
                    </div>
                  </div>
                  <div className="twitter-article">
                    <div className="twitter-img">
                      <a href="#">
                        <img src="img/twitter/twitter-1.png" alt />
                      </a>
                    </div>
                    <div className="twitter-text">
                      <p>
                        Raboda Fashion #Magento #Theme comes up with pure white
                        and grey, which great show your products. Check it:
                      </p>
                      <a href="#">https://t.co/iu0OYBwti8</a>
                      <div className="twitter-time">
                        <a href="#">16h</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div className="col-md-3 col-sm-4">
              <div className="footer-support">
                <div className="footer-title">
                  <h3>Our support</h3>
                </div>
                <div className="footer-menu">
                  <ul>
                    <li>
                      <a href="#">Sitemap</a>
                    </li>
                    <li>
                      <a href="#">Privacy Policy</a>
                    </li>
                    <li>
                      <a href="#">Your Account</a>
                    </li>
                    <li>
                      <a href="#">Advanced Search</a>
                    </li>
                    <li>
                      <a href="contact.html">Contact Us</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
            <div className="col-md-3 col-sm-4">
              <div className="footer-info">
                <div className="footer-title">
                  <h3>Our information</h3>
                </div>
                <div className="footer-menu">
                  <ul>
                    <li>
                      <a href="about-us.html">About Us</a>
                    </li>
                    <li>
                      <a href="#">Customer Service</a>
                    </li>
                    <li>
                      <a href="#">Privacy Policy</a>
                    </li>
                    <li>
                      <a href="#">Orders and Returns</a>
                    </li>
                    <li>
                      <a href="#">Site Map</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* footer top area end */}
      {/* footer area start */}
      <footer className="footer-area">
        <div className="container">
          <div className="row">
            <div className="col-sm-6">
              <div className="footer-copyright">
                <p>
                  Copyright © 2016 <a href="#"> Bootexperts</a>. All Rights
                  Reserved
                </p>
              </div>
            </div>
            <div className="col-sm-6">
              <div className="payment-icon">
                <img src="img/payment.png" alt />
              </div>
            </div>
          </div>
        </div>
        <a href="#" id="scrollUp">
          <i className="fa fa fa-arrow-up" />
        </a>
      </footer>
      {/* footer area end */}
      {/* quickview product start */}
      <div id="quickview-wrapper">
        {/* Modal */}
        <div
          className="modal fade"
          id="productModal"
          tabIndex={-1}
          role="dialog"
        >
          <div className="modal-dialog" role="document">
            <div className="modal-content">
              <div className="modal-header">
                <button
                  type="button"
                  className="close"
                  data-dismiss="modal"
                  aria-label="Close"
                >
                  <span aria-hidden="true">×</span>
                </button>
              </div>
              <div className="modal-body">
                <div className="modal-product">
                  <div className="product-images">
                    <div className="main-image images">
                      <img alt src="img/product/quick-view.jpg" />
                    </div>
                  </div>
                  <div className="product-info">
                    <h1>Diam quis cursus</h1>
                    <div className="price-box">
                      <p className="price">
                        <span className="special-price">
                          <span className="amount">$132.00</span>
                        </span>
                      </p>
                    </div>
                    <a href="shop.html" className="see-all">
                      See all features
                    </a>
                    <div className="quick-add-to-cart">
                      <form method="post" className="cart">
                        <div className="numbers-row">
                          <input
                            type="number"
                            id="french-hens"
                            defaultValue={3}
                          />
                        </div>
                        <button
                          className="single_add_to_cart_button"
                          type="submit"
                        >
                          Add to cart
                        </button>
                      </form>
                    </div>
                    <div className="quick-desc">
                      <p>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                        Nam fringilla augue nec est tristique auctor. Donec non
                        est at libero vulputate rutrum. Morbi ornare lectus quis
                        justo gravida semper. Nulla tellus mi, vulputate
                        adipiscing cursus eu, suscipit id nulla.
                      </p>
                    </div>
                    <div className="share-post">
                      <div className="share-title">
                        <h3>share this product</h3>
                      </div>
                      <div className="share-social">
                        <ul>
                          <li>
                            <a href="#">
                              {" "}
                              <i className="fa fa-facebook" />{" "}
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              {" "}
                              <i className="fa fa-twitter" />{" "}
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              {" "}
                              <i className="fa fa-pinterest" />{" "}
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              {" "}
                              <i className="fa fa-google-plus" />{" "}
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              {" "}
                              <i className="fa fa-linkedin" />{" "}
                            </a>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default HomePage;
