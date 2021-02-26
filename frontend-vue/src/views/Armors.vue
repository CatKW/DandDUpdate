<template>
  <div class="main">
    <div class="header">
    <h1 class="title">Dungeons and Dragons: Armor</h1>
    <img class="armor" alt="armor" src="../assets/weapon-gallery.png">


  
   </div>


    <router-link to="armor/add" tag="button" class="button is-primary">Add Armor</router-link>

    <div class="content">
      <table id="armors" class="table">
        <thead>
          <tr>
            <th>#</th>
            <th>Type</th>
            <th>Name</th>
            <th>Class and Modifier</th>
            <th>Weight (lbs)</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="armor in armors" :key="armor.id">
            <td>{{armor.id}}</td>
            <td>{{armor.type}}</td>
            <td>{{armor.name}}</td>
            <td>{{armor.classNumber}} {{armor.modifier}}</td>
            <td>{{armor.weight}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

  <script>
  export default {
    name: "Armors",
    data: () => ({
      armors:[]
    }),
    async mounted(){
      console.log('armors mounted being')
      const{data} = await this.$http.get('http://localhost:8080/api/armor');
      console.log('armors mounted data', data)
      this.armors = data;
    }  
  }
  </script>
<style scoped>
.button {
    float: right;
    margin-top: 10px;
    margin-bottom: 10px;
    background-color: darkblue;
    color: white;    
}

.button:hover {
    background-color: green;
    color: white;
}

.title{
    color: darkblue
    
}


</style>