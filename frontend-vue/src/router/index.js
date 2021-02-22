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
  },
  {
    path: '/weapons',
    name: 'Weapons',
    component: () => import ('../views/Weapons.vue')
  },
  {
    path: '/alignments',
    name: 'Alignments',
    component: () => import ('../views/Alignments.vue')
  },
  {
  path: '/races',
  name: 'Races',
  component: () => import ('../views/Races.vue')
  },
  {
    path: '/creatures',
    name: 'Creatures',
    component: () => import ('../views/Creatures.vue')
  },
  
  {
    path: '/players',
    name: 'Players',
    component: () => import('../views/Players.vue')
  },
  {
    path: '/player/:id',
    name: 'Player',
    component: () => import ('../views/PlayerDetails.vue')
  }, 
  {
    path: '/players/add',
    name: 'AddPlayers',
    component: () => import ('../views/AddPlayer.vue')
  }


]

const router = new VueRouter({
  routes
})

export default router
