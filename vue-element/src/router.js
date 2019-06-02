import Vue from 'vue'
import Router from 'vue-router'
import List from './views/List.vue'
import Create from './views/Create.vue'
import Edit from './views/Edit.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      redirect: '/list'
    },
    {
      path: '/list',
      name: 'list',
      component: List
    },
    {
      path: '/create',
      name: 'create',
      component: Create
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: Edit
    },
  ]
})
