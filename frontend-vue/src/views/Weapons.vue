<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Weapons</h1>
            <img class="weapon" alt="weapon" src="../assets/encumbrance.png">
            </div>

        <router-link to="weapon/add" tag="button" class="button is-primary">Add Weapon</router-link>

        <div class="content">
            <table id="weapons" class="table">
                <thead>
                    <tr>
                        <th>Type</th>
                        <th>Name</th>
                        <th>Damage Roll</th>
                        <th>Weight (lbs)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="weapon in weapons" :key="weapon.id">
                        <td>{{weapon.type}}</td>
                        <td>{{weapon.name}}</td>
                        <td>{{weapon.damage}}</td>
                        <td>{{weapon.weight}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Weapons",
    data: () => ({
        weapons:[]
    }),
    async mounted() {
        console.log('weapons being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/weapons');
        console.log('weapons mounted data', data)
        this.weapons = data;
    }
}
</script>

<style scoped>
.button {
    margin-left: 45%;
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
    color: darkblue;  
    text-align: center;
}
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}




</style>