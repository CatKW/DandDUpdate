<template>
    <div class="main">

        <div class="header">
            <h1 class="title">Dungeons and Dragons: Races</h1>

            <img class="race" alt="race" src="../assets/races.png">
            
         
        </div>

        <p>Click on Description for additional details.</p>


        <div class="content">
            <table id="races" class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th><a class="description" v-bind:href="'https://www.dndbeyond.com/races'">Description</a></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="race in races" :key="race.id">
                        <td>{{race.name}}</td>
                        <td>{{race.description}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Races",
    data: () => ({
        races:[]
    }),
    async mounted() {
        console.log('races mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/races');
        console.log('races mounted data', data)
        this.races = data;
    }
}
</script>
<style scoped>
p {
    font-style: italic;
    color: darkblue;
    text-align: center;
    margin-top: .5em;
    margin-bottom: .5em;
}

.description:hover {
    color: #5b7eb8;
}

.description {
      color: #2c3e50;
}
</style>

