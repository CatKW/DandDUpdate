<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Races</h1>
            <p>Click on Description for additional details</p>
        </div>

        <div class="content">
            <table id="races" class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th><a v-bind:href="'https://www.dndbeyond.com/races'">Description</a></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="race in races" :key="race.id">
                        <td>{{race.id}}</td>
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