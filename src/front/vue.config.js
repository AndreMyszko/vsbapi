const path = require('path')

//ALIAS DO BOOTRSTRAP VUE:
module.exports = {
  chainWebpack: config => {
    config.resolve.alias.set(
      'vue$',
      path.resolve(__dirname, 'node_modules/vue/dist/vue.runtime.esm.js')
    )
  }
}

//CONEXÃO COM BACKEND:
module.exports = {
    devServer: {
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://localhost:8082',
                ws: true,
                changeOrigin: true,
                runtimeCompiler: true
            }
        }
    },
      
}