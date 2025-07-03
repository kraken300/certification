import { useRoutes } from "react-router-dom";
import Home from "../Home";
import Products from "../Products";
import NewProducts from "../Product/NewProducts";
import FeaturedProducts from "../Product/FeaturedProducts";
import About from "../About";
import Users from "../Users/Users";
import Admin from "../Users/Admin";
import UserData from "../Users/UserData";
import PageNotFound from "../PageNotFound";
import OrderSummary from "../OrderSummary";

function DemoRoute() {
    let routes = useRoutes([
        {
            path: "/",
            element: <Home />
        },
        {
            path: "/products",
            element: <Products />,
            children: [
                {
                    path: "new",
                    element: <NewProducts />
                },
                {
                    path: "featured",
                    element: <FeaturedProducts />
                },
                {
                    element: <NewProducts />,
                    index: true
                }
            ]
        },
        {
            path: "/about-us",
            element: <About />
        },
        {
            path: "/users",
            element: <Users />,
            children: [
                {
                    path: "admin",
                    element: <Admin />
                },
                {
                    path: ":userId",
                    element: <UserData />
                }
            ]
        },
        {
            path: "*",
            element: <PageNotFound />
        },
        {
            path: "/order-summary",
            element: <OrderSummary />
        }
    ]);

    return routes;
}

export default DemoRoute;