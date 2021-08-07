const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    mode: "development",
    entry: {
        "index": "./public/js/index.js",
        "customer-login": "./public/js/customer-login-script.js",
        "admin-login": "./public/js/admin-login-script.js",
        "admin-add-cab": "./public/js/admin-add-cab-script.js",
        "admin-add-driver": "./public/js/admin-add-driver-script.js",
        "customer-trip-ui-1":"./public/js/customer-ui-1-script.js",
        "customer-trip-ui-2":"./public/js/customer-ui-2-script.js"
    },
    output: {
        path: path.join(__dirname, "dist"),
        filename: "[name].bundle.js",
        clean: true
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                use: "babel-loader"
            },
            {
                test: /\.css$/i,
                use: [
                    "style-loader",
                    "css-loader"
                ]
            }
        ]
    },
    plugins: [
        new HtmlWebpackPlugin({
            title: 'Home',
            filename: './index.html',
            template: path.join(__dirname, 'public', 'index.html'),
            inject: true,
            chunks: ['index']
        }),
        new HtmlWebpackPlugin({
            title: 'Login',
            filename: './login.html',
            template: path.join(__dirname, 'public', 'login.html'),
            inject: true,
            chunks: ['index']
        }),
        new HtmlWebpackPlugin({
            title: 'Customer Login',
            filename: './customer-login.html',
            template: path.join(__dirname, 'public', 'customer-login.html'),
            inject: true,
            chunks: ['index', 'customer-login']
        }),
        new HtmlWebpackPlugin({
            title: 'Cab-Booking',
            filename: './customer-ui-1.html',
            template: path.join(__dirname, 'public', 'customer-ui-1.html'),
            inject: true,
            chunks: ['index', 'customer-trip-ui-1']
        }),
        new HtmlWebpackPlugin({
            title: 'Cab-Booking',
            filename: './customer-ui-2.html',
            template: path.join(__dirname, 'public', 'customer-ui-2.html'),
            inject: true,
            chunks: ['index',"customer-trip-ui-2"]
        }),
        new HtmlWebpackPlugin({
            title: 'Cab-Booking',
            filename: './driver-ui-1.html',
            template: path.join(__dirname, 'public', 'driver-ui-1.html'),
            inject: true,
            chunks: ['index']
        }),
        new HtmlWebpackPlugin({
            title: 'Cab-Booking',
            filename: './driver-ui-2.html',
            template: path.join(__dirname, 'public', 'driver-ui-2.html'),
            inject: true,
            chunks: ['index']
        }),
        new HtmlWebpackPlugin({
            title: 'Cab-Booking',
            filename: './driver-regis.html',
            template: path.join(__dirname, 'public', 'driver-regis.html'),
            inject: true,
            chunks: ['index', 'admin-add-driver']
        }),
        new HtmlWebpackPlugin({
            title: 'Admin-Portal',
            filename: './admin-ui-2.html',
            template: path.join(__dirname, 'public', 'admin-ui-2.html'),
            inject: true,
            chunks: ['index', 'admin-add-cab']
        }),
        new HtmlWebpackPlugin({
            title: 'Admin-Portal',
            filename: './admin-ui-1.html',
            template: path.join(__dirname, 'public', 'admin-ui-1.html'),
            inject: true,
            chunks: ['index']
        }),
        new HtmlWebpackPlugin({
            title: 'Admin-Portal',
            filename: './admin-login.html',
            template: path.join(__dirname, 'public', 'admin-login.html'),
            inject: true,
            chunks: ['index', 'admin-login']
        }),
    ]
}
