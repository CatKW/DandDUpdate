<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Classes</h1>
            <img class="creature" alt="creature" src="../assets/dndcharacters.png">
        </div>

         

        <div class="content">
            <table id="creatures" class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="creature in creatures" :key="creature.id">
                        <td>{{creature.id}}</td>
                        <td><a @click="creatureDetail(creature.id)">{{creature.name}}</a></td>
                        <td>{{creature.description}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    data: () => ({
        creatures:{},
    }),

    methods: {
        creatureDetail(creatureId){
            this.$router.push('creature/' + creatureId);
        }
    },

    async mounted() {
        console.log('creatures being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/creature');
        console.log('creatures mounted data', data)
        this.creatures = data;
    }
}
</script>

