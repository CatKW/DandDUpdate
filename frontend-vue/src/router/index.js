import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/armors',
    name: 'Armors',
    // route level code-splitting
    // this generates a separate chunk (armor.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "armor" */ '../views/Armors.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
