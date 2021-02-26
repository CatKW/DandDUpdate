<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Level Table</h1>
            <img class="level" alt="level" src="../assets/level1.png">
        </div>
        <p class="feat">A feat represents a talent or an area of expertise that gives a character special abilities</p>
        <p class="ability">An ability score increase will become available at certain levels. This will allow you to increase an ability specified by your race or class</p>

        <div class="content">
            <table id="levels" class="table">
                <thead>
                    <tr>
                        <th>Level</th>
                        <th>XP Needed</th>
                        <th>Proficiency Bonus</th>
                        <th>Feat Availaible</th>
                        <th>Ability Increase Available</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="level in levels" :key="level.id">
                        <td>{{level.level}}</td>
                        <td>{{level.experiencePoints}}</td>
                        <td>{{level.proficiencyBonus}}</td>
                        <td>{{level.feats}}</td>
                        <td>{{level.abilityIncrease}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    data: () => ({
        levels:"",
    }),
    
    async mounted() {
        console.log('levels being mounted')
        const {data} =  await this.$http.get('http://localhost:8080/api/level');
        console.log('levels mounted data', data)
        this.levels = data;
    }
}
</script>

<style scoped>
.feat {
    margin-top: 1%;
    font-style: italic;
}
.ability {
    margin-bottom: 1%;
    font-style: italic;
}

p {
    text-align: center;
    color: darkblue;
}

</style>