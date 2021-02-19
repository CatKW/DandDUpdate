<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Classes</h1>
        </div>
        <div class="content">
            <table id="playerclasses" class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="playerclass in playerclasses" :key="playerclass.id">
                        <td>{{playerclass.id}}</td>
                        <td><a @click="playerclassDetails(playerclass.id)">{{playerclass.playerclassName}}</a></td>
                        <td>{{playerclass.playerclassDesc}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    data: () => ({
        playerclasses:[]
    }),

    methods: {
        playerclassDetails(playerclassId) {
            this.$router.push('playerclass/' + playerclassId);
        }
    },
    
    async mounted() {
        console.log('playerclasses being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/playerclass');
        console.log('playerclasses mounted data', data)
        this.playerclasses = data;
    }
}
</script>