<template>
    <div>
        <span class="creatures">{{creature.name}}</span>
         
         <iframe width="560" height="315" :src="creature.video" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>

</template>

<script>
export default {
    data: () => ({
        creature: ""
    }),
    async mounted() {
        const {data} = await this.$http.get('http://localhost:8080/api/creature/' + this.$route.params.id);
        this.creature = data;
    }
}
</script>

<style scoped>
.creatures {
    padding-left: 20%;
    padding-top: 3em;
}

span {
    padding-right: 5%;
    padding-top: 10em;
}
</style>