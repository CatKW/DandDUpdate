<template>
  <div class="main">
    <div class="header">
    <h1 class="title">Dungeons and Dragons: Armor</h1>
    </div>

    <div class="content">
      <table id="armors" class="table">
        <thead>
          <tr>
            <th>#</th>
            <th>Armor Type</th>
            <th>Armor Name</th>
            <th>Armor Class and Modifier</th>
            <th>Armor Weight</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="armor in armors" :key="armor.id">
            <td>{{armor.id}}</td>
            <td>{{armor.armorTypes}}</td>
            <td>{{armor.armorNames}}</td>
            <td>{{armor.armorClasses}} {{armor.acModifiers}}</td>
            <td>{{armor.armorWeights}}</td>
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
      this.armor = data;
    }  
  }
  </script>